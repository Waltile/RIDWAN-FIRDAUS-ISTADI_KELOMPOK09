from pymongo import MongoClient
from datetime import datetime

class Data:
    
    def __init__(self):
        client = MongoClient('mongodb://localhost:27017')
        db = client['toko_sepatu']

        current = datetime.now()
        tahun = current.year
        bulan = current.month
        hari = current.day

        user = db["tabel_user"]
        user.create_index("username", unique=True)
        
        dict_user = [
            {"id": 1, "nama": "admin", "username":"admin", "password":"admin", "role_id":1},
            {"id": 2, "nama": "user", "username":"user", "password":"user", "role_id":2}
        ]
        user.insert_many(dict_user)

        laporan = db["tabel_laporan"]
        data_laporan = [
            {"Nomor": 1, "Nama": "test", "Alamat" : "rawamangun", "No Telepon" : "021953672231"},
            {"Nomor": 2, "Nama": "test2", "Alamat" : "cipinang", "No Telepon" : "02195363217"}
        ]
        laporan.insert_many(data_laporan)

        barang = db["tabel_barang"]
        data_barang = [
            {"Nomor":1, "Nama Barang":"Sepatu", "Merk":"Compass", "Kategori":"public low","Ukuran": "42", "harga":"250000"},
            {"Nomor": 2, "Nama Barang":"Sepatu", "Merk":"Ventela", "Kategori":"public high","Ukuran": "40", "harga":"200000"}
        ]
            
        result_barang = barang.insert_many(data_barang)
        result_id = result_barang.inserted_ids
        
        print(client.list_database_names())
        print(db.list_collection_names())
        
      
if __name__ == "__main__":
    Data()
