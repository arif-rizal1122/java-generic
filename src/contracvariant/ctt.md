# CONTRACTVARIANT

1. Contravariant artinya kita bisa melakukan subtitusi supertype (parent) dengan subtype (child)
2. Caranya agar generic object kita menjadi contravariant adalah dengan menggunakan kata kunci (? super SubClass)
3. Artinya saat kita membuat object Contoh<Object>, maka bisa disubtitusi menjadi Contoh<? super String>
4. Contravariant adalah bisa write dan read, namun perlu berhati-hati ketika melakukan read, terutama jika sampai parent nya punya banyak child



