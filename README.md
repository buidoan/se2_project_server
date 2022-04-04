# se2_project_server
ecommercial web
api
--authentication
post :/login 
{<br />
   "userName":"user",
    "userPassword":"123"
 }<br />
 post:/register
 
 {<br />
   "userName":"example",
    "userPassword":"example"
 }<br />
 --product<br />
 create new product 
 post:/product
 {
    
        "title": "Pack 2 áo ba lỗ mặc nhà nam",
        "desc": "Pack 2 áo ba lỗ mặc nhà nam",
        "image1": "https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-blazer-nam-1?alt=media&token=9c682603-407d-438a-a4db-d8ee86a0aad7",
        "image2": "https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-blazer-nam-2?alt=media&token=2b040faf-edb1-4184-8e26-5e2b30b7c363",
        "image3": "https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-blazer-nam-3?alt=media&token=ff5c46ff-9bc5-4e72-9713-e9d0cac29eb7",
        "rating": null,
        "discount": 0,
        "regularPrice":5000000.0,
        "slugName": "pack-2-ao-ba-lo-mac-0-nha-nam",
        "categorySlug": null,
        "genders": [
            {
                "genderName": "male"
            }
        ],
        "colors": [
            {
                "colorName": "white"
            },
            {
                "colorName": "black"
            }
        ],
        "sizes": [
            {
                "size": "M"
            },
            {
                "size": "L"
            },{
                "size": "XL"
            }
        ]
    }
 
