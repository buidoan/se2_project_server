INSERT INTO `se2`.`role` (`id`, `role_name`) VALUES ('1', 'User');
INSERT INTO `se2`.`role` (`id`, `role_name`) VALUES ('2', 'Admin');

INSERT INTO `se2`.`user` (`id`,`user_name`, `user_password`) VALUES ('1','user', '$2a$10$yyzrbW26RKwlBIioraT.lO/v6D9buH0CpYAQsqKOJINaHdwM1UX6G');
INSERT INTO `se2`.`user` (`id`,`user_name`, `user_password`) VALUES ('2','admin', '$2a$10$yyzrbW26RKwlBIioraT.lO/v6D9buH0CpYAQsqKOJINaHdwM1UX6G');
INSERT INTO `se2`.`user_role` (`user_id`, `role_id`) VALUES ('1', '1');
INSERT INTO `se2`.`user_role` (`user_id`, `role_id`) VALUES ('2', '2');

INSERT INTO `se2`.`gender` (`gender_name`) VALUES ('male');
INSERT INTO `se2`.`gender` (`gender_name`) VALUES ('female');

INSERT INTO `se2`.`size` (`size_name`) VALUES ('S');
INSERT INTO `se2`.`size` (`size_name`) VALUES ('M');
INSERT INTO `se2`.`size` (`size_name`) VALUES ('L');
INSERT INTO `se2`.`size` (`size_name`) VALUES ('XL');
INSERT INTO `se2`.`size` (`size_name`) VALUES ('XXL');
INSERT INTO `se2`.`size` (`size_name`) VALUES ('XXXL');

INSERT INTO `se2`.`color` (`color_name`) VALUES ('white');
INSERT INTO `se2`.`color` (`color_name`) VALUES ('black');
INSERT INTO `se2`.`color` (`color_name`) VALUES ('blue');
INSERT INTO `se2`.`color` (`color_name`) VALUES ('red');
INSERT INTO `se2`.`color` (`color_name`) VALUES ('yellow');
INSERT INTO `se2`.`color` (`color_name`) VALUES ('green');

INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('ao-khoac');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('ao-len');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('quan-dai');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('ao-thun');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('vay-lien');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('ao-phông');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('quan-jean');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('ao-ni');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('quan-dui');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('ao-somi');
INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Áo blazer nam dáng ôm gọn gàng cơ thể. Áo 2 lớp bên trong có lớp lót mềm.', current_timestamp(), '0', 
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-blazer-nam-1?alt=media&token=9c682603-407d-438a-a4db-d8ee86a0aad7', 
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-blazer-nam-2?alt=media&token=2b040faf-edb1-4184-8e26-5e2b30b7c363', 
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-blazer-nam-3?alt=media&token=ff5c46ff-9bc5-4e72-9713-e9d0cac29eb7', 
'899000', 'ao-blazer-nam', 'Áo blazer nam','ao-khoac');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('1', 'green');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('1', 'red');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('1', 'male');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('1', 's');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('1', 'm');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Áo cardigan nữ', current_timestamp(), '0', 
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-cardigan-nu-1?alt=media&token=3a82d7c8-2cbe-489f-9583-b7dbd0946bc3', 
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-cardigan-nu-2?alt=media&token=d83f7c59-a042-49b1-9080-e01c746352be', 
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-cardigan-nu-3?alt=media&token=ab0d7815-623d-4b79-aa37-ebb43c6938f5', 
'699000', 'a0-cardigan-nu', 'Áo cardigan nữ','ao-len');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('2', 'yellow');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('2', 'green');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('2', 'female');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('2', 'm');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('2', 'l');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Quần nỉ chất liệu cotton pha. Quần dáng basic có lé phối 2 bên sườn.', current_timestamp(), '0', 
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/quan-ni-nu-1?alt=media&token=8bddb8e8-5059-4fc3-9f8d-6788830aa88c',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/quan-ni-nu-2?alt=media&token=a9edbb3d-22c1-4f7a-8afa-9468336b54ca',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/quan-ni-nu-3?alt=media&token=7ec02855-35a4-4560-a362-a99a882f01ee',
'369000', 'quan-ni-nu','Quần nỉ nữ','quan-dai');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('3', 'white');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('3', 'black');

INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('3', 'female');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('3', 'm');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('3', 'l');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('3', 'xl');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Pack 2 áo ba lỗ mặc nhà nam',current_timestamp(),'0',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/pack-2-ao-ba-lo-mac-nha-nam-1?alt=media&token=14df7689-47de-4f6c-96bb-52510613841a',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/pack-2-ao-ba-lo-mac-nha-nam-2?alt=media&token=171c809a-5bfa-4354-a2f4-507175dace12',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/pack-2-ao-ba-lo-mac-nha-nam-3?alt=media&token=744e19c0-6f28-470f-859d-b3e57fc29a17',
'199000', 'pack-2-ao-ba-lo-mac-0-nha-nam','Pack 2 áo ba lỗ mặc nhà nam','ao-thun');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('4', 'white');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('4', 'black');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('4', 'male');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('4', 'm');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('4', 'l');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('4', 'xl');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Váy liền nữ kèm đai. Tay dài cổ đức. Chất liệu 96% polyester 4% spandex.',current_timestamp(), '0',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/vay-lien-nu-1?alt=media&token=5f8b25c8-58d4-4414-bfed-1f8d057f978a',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/vay-lien-nu-2?alt=media&token=fa563a15-c13d-4767-bfdb-31e1f4a4dab2',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/vay-lien-nu-3?alt=media&token=93d45c58-9b5a-4ace-a2f4-a1d554a8438b',
'799000','vay-lien-nu', 'Váy liền nữ','vay-lien');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('5', 'green');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('5', 'white');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('5', 'female');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('5', 'm');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('5', 's');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Quần mặc nhà nam',current_timestamp(), '0',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/quan-mac-nha-nam-1?alt=media&token=f95230b7-e48c-4e6a-8dad-a96ec06df739',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/quan-mac-nha-nam-2?alt=media&token=c8681929-88a9-428e-b3f0-193cc5b008c7',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/quan-mac-nha-nam-3?alt=media&token=e9ea02e1-5a60-448e-b5cf-6dc1c11dd380',
'290000','quan-mac-nha-nam', 'Quần mặc nhà nam','quan-dai');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('6', 'black');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('6', 'male');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('6', 'l');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('6', 'xl');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('6', 'xxl');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Áo khoác bomber dạ nam tay raglan, phối vải kẻ thân trước. Mở khóa thân trước, túi cơi 2 bên. Gấu áo và cổ áo dùng bo dệt',current_timestamp(), '0',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-khoac-bomber-da-nam-1?alt=media&token=ece67de2-ec41-456e-aa73-c134244a00ee',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-khoac-bomber-da-nam-2?alt=media&token=2de8843d-8ab5-48f7-92ec-40110bf6290d',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-khoac-bomber-da-nam-3?alt=media&token=02e332f4-8be8-4a5a-8af8-e8fb5a9b042d',
'11900000','ao-khoac-bomber-da-nam', 'Áo khoác bomber dạ nam','ao-khoac');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('7', 'white');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('7', 'black');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('7', 'blue');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('7', 'male');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('7', 's');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('7', 'm');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('7', 'l');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('7', 'xl');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Áo phông nam dài tay cổ tròn dáng Regular hình in nhân vật Marvel',current_timestamp(), '0',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-phong-nam-dai-tay-1?alt=media&token=fe6e2871-1d2b-4d9a-922b-30469464091f',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-phong-nam-dai-tay-2?alt=media&token=30b07679-8b38-4683-a6f3-4fc4263d3fc2',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-phong-nam-dai-tay-3?alt=media&token=c072fca1-a634-4784-b4d4-20b4f5900b71',
'379000', 'ao-phong-nam-dai-tay', 'Áo phông nam dài tay','ao-phông');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('8', 'black');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('8', 'white');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('8', 'yellow');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('8', 'male');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('8', 's');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('8', 'm');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('8', 'l');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('8', 'xl');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('8', 'xxl');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Áo len lông cừu nữ cổ lọ',current_timestamp(), '5',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-len-long-cuu-nu-co-lo-3?alt=media&token=df0cac0b-d41a-4a49-8d13-efdf3d2b4dc2',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-len-long-cuu-nu-co-lo-2?alt=media&token=d5937f77-cedb-46d0-a92e-1049a4f5b7d9',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-len-long-cuu-nu-co-lo-1?alt=media&token=7b48f611-70f8-4a1d-be17-a6b872cb8862',
'899000', 'ao-len-long-cuu-nu-co-lo', 'Áo len lông cừu nữ cổ lọ','ao-len');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('9', 'yellow');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('9', 'black');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('9', 'female');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('9', 'm');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('9', 'l');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('9', 's');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Áo len nữ cổ tròn dài tay',current_timestamp(), '10',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-len-nu-co-tron-1?alt=media&token=a06d639d-f6d6-4a80-ad81-cbaf3583864a',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-len-nu-co-tron-2?alt=media&token=8068c17f-7315-4041-95a3-2c41e38be306',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-len-nu-co-tron-3?alt=media&token=380f5aa3-8f7c-41a3-a05c-abd5d6204fbf',
'299000', 'ao-len-nu-co-tron', 'Áo len nữ cổ tròn','ao-len');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('10', 'white');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('10', 'red');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('10', 'yellow');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('10', 'black');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('10', 'female');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('10', 'm');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('10', 's');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('10', 'l');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('10', 'xl');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Quần jeans chất liệu cotton có co giãn. Dáng ôm, cạp thường. Cài cúc, khoá kim loại.',current_timestamp(), '5',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/quan-jeans-nam-1?alt=media&token=658976cf-5e13-4579-ada2-259c9a7f443c',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/quan-jeans-nam-2?alt=media&token=36855cf1-ed78-4d3e-8d43-b0a539408165',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/quan-jeans-nam-3?alt=media&token=f260dea3-a75d-41d4-812b-168aeb4b376b',
'699000', 'quan-jeans-nam-1', 'Quần jeans nam','quan-jean');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('11', 'blue');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('11', 'male');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('11', 'm');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('11', 'l');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('11', 'xl');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('11', 'xxl');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Áo nỉ chất liệu Inerlock dáng Oversized, mũ không dây dệt, hình in typo',current_timestamp(), '0',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-hoodie-nam-2?alt=media&token=93c77d15-e343-41e0-9a4d-d5e4a6d56b39',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-hoodie-nam-3?alt=media&token=4b4fb02b-05d0-4673-a11f-188384ddfaf1',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-hoodie-nam-3?alt=media&token=4b4fb02b-05d0-4673-a11f-188384ddfaf1',
'690000', 'ao-hoodie-nam', 'Áo hoodie nam','ao-ni');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('12', 'yellow');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('12', 'white');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('12', 'male');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('12', 'm');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('12', 'xl');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Bộ mặc nhà nam sát nách.',current_timestamp(), '0',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/bo-mac-nha-nam-sat-nach-1?alt=media&token=b78d91bf-fd59-466a-98d7-71f529408071',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/pack-2-ao-ba-lo-mac-nha-nam-2?alt=media&token=171c809a-5bfa-4354-a2f4-507175dace12',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/bo-mac-nha-nam-sat-nach-3?alt=media&token=c2e425ff-a64d-4e6b-9cd6-16480e5e27f0',
'369000', 'bo-mac-nha-nam-sat-nach', 'Bộ mặc nhà nam sát nách','ao-phông');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('13', 'yellow');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('13', 'white');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('13', 'black');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('13', 'male');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('13', 'm');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('13', 'l');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('13', 'xl');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('13', 'xxl');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Bộ mặc nhà, áo ngắn tay cổ tròn, quần dài dáng suông',current_timestamp(), '0',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/bo-mac-nha-nu-1?alt=media&token=2105e017-2456-480d-ba47-61540e5a1085',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/bo-mac-nha-nu-2?alt=media&token=a240be45-6657-43c0-a8a7-4ae1d556fd62',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/bo-mac-nha-nu-3?alt=media&token=b4431376-6007-4aa6-9bea-a3c54b1145f4',
'449000', 'bo-mac-nha-nu', 'Bộ mặc nhà nữ','quan-dai');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('14', 'red');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('14', 'white');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('14', 'female');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('14', 's');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('14', 'm');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('14', 'l');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Quần soóc nữ',current_timestamp(), '50',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/quan-sooc-nu-1?alt=media&token=ef9e64ea-381a-4136-9913-44a8ff47c591',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/quan-sooc-nu-2?alt=media&token=09e426c6-28a0-4a7f-82a6-c8b5831a8d3b',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/quan-sooc-nu-3?alt=media&token=14413b13-1617-42ef-9190-bfdfd33dcf88',
'449000', 'quan-sooc-nu', 'Quần soóc nữ','quan-dui');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('15', 'red');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('15', 'black');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('15', 'female');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('15', 's');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('15', 'm');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Áo sơ mi dáng dài regular, chất liệu cotton pha, tay phồng',current_timestamp(), '0',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-so-mi-nu-co-duc-1?alt=media&token=18d1945b-8661-411f-9ee8-e307e6d9a94f',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-so-mi-nu-co-duc-2?alt=media&token=bd47fbf2-f0e5-40c0-b027-b6ce9d7c798d',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-so-mi-nu-co-duc-3?alt=media&token=9cc9d855-8a9b-4db5-bd51-eace450710f8',
'499000', 'ao-so-mi-nu-co-duc', 'Áo sơ mi nữ cổ đức','ao-somi');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('16', 'white');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('16', 'blue');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('16', 'female');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('16', 'm');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('16', 'l');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Áo khoác gió 2 lớp có mũ, mở khóa thân trước, túi 2 bên',current_timestamp(), '0',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-khoac-gio-nam-1?alt=media&token=5089284c-d139-443a-92a7-b660d48fb075',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-khoac-gio-nam-2?alt=media&token=6e6b12fb-f0be-49fd-ad31-7e9da51e5561',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-khoac-gio-nam-3?alt=media&token=56c99405-5ea3-4570-bd1c-20cc0b6645ab',
'799000', 'ao-khoac-gio-nam', 'Áo khoác gió nam','ao-khoac');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('17', 'yellow');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('17', 'black');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('17', 'male');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('17', 'xl');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('17', 'xxl');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('17', 'xxxl');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('17', 'l');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) 
VALUES ('Quần khaki cotton có co giãn. Dáng ôm, cạp thường, có túi hai bên.',current_timestamp(), '0',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/quan-khaki-nam-1?alt=media&token=5edef9f9-ef85-4fe6-80a7-c93ab198c377',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/quan-khaki-nam-2?alt=media&token=4de73d86-2e40-43df-9436-201f5885fd17',
'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/quan-khaki-nam-3?alt=media&token=02bb7010-602d-4146-941d-5468151478e2',
'799000', 'quan-khaki-nam', 'Quần khaki nam', 'quan-dai');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('18', 'black');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('18', 'yellow');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('18', 'blue');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('18', 'male');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('18', 'm');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('18', 'l');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('18', 'xl');



