-- noinspection SqlDialectInspection

insert into tb_member(member_sq, id, password, nickname, address, genre, profile_img_url, reg_dt) values
                          (null,'i1','test','n1',null,null, null, default)
                          ,(null,'i2','test','n2',null,null, null, default)
                          ,(null,'i3','test','n3',null,null, null, default)
                          ,(null,'i4','test','alex',null,"horror", null, default)
                          ,(null,'i5','test','t1',null,null, null, default)
                          ,(null,'i6','test','t2',null,null, null, default)
                          ,(null,'i7','test','t3',null,null, null, default)
                          ,(null,'i8','test','t4',null,null, null, default)
                          ,(null,'i9','test','t5',null,null, null, default)
                          ,(null,'i10','test','t6',null,null, null, default)
                          ,(null,'i11','test','t7',null,null, null, default)
                          ,(null,'i12','test','t8',null,null, null, default);

insert into tb_card(card_sq, title, content, img_url, like_cnt, member_sq, reg_dt) values
                        (null, 'title1', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor accumsan leo, vitae blandit metus ullamcorper vel. Curabitur velit massa, tempor eget elit ut, placerat ultricies ligula. Proin felis libero, malesuada vel imperdiet ac, ullamcorper quis ante. Nunc sed euismod elit, id consectetur dolor. Vivamus scelerisque sapien sit amet ligula varius, eu luctus sapien bibendum.'
                            ,'https://images.unsplash.com/photo-1478098711619-5ab0b478d6e6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80', default, 1, default ),

                        (null, 'title2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor accumsan leo, vitae blandit metus ullamcorper vel. Curabitur velit massa, tempor eget elit ut, placerat ultricies ligula. Proin felis libero, malesuada vel imperdiet ac, ullamcorper quis ante. Nunc sed euismod elit, id consectetur dolor. Vivamus scelerisque sapien sit amet ligula varius, eu luctus sapien bibendum.'
                        ,'https://images.unsplash.com/photo-1478098711619-5ab0b478d6e6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80', default, 1, default ),

                        (null, 'title3', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor accumsan leo, vitae blandit metus ullamcorper vel. Curabitur velit massa, tempor eget elit ut, placerat ultricies ligula. Proin felis libero, malesuada vel imperdiet ac, ullamcorper quis ante. Nunc sed euismod elit, id consectetur dolor. Vivamus scelerisque sapien sit amet ligula varius, eu luctus sapien bibendum.'
                        ,'https://images.unsplash.com/photo-1478098711619-5ab0b478d6e6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80', default, 1, default ),

                        (null, 'title4', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor accumsan leo, vitae blandit metus ullamcorper vel. Curabitur velit massa, tempor eget elit ut, placerat ultricies ligula. Proin felis libero, malesuada vel imperdiet ac, ullamcorper quis ante. Nunc sed euismod elit, id consectetur dolor. Vivamus scelerisque sapien sit amet ligula varius, eu luctus sapien bibendum.'
                        ,'https://images.unsplash.com/photo-1478098711619-5ab0b478d6e6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80', default, 1, default ),

                        (null, 'title5', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor accumsan leo, vitae blandit metus ullamcorper vel. Curabitur velit massa, tempor eget elit ut, placerat ultricies ligula. Proin felis libero, malesuada vel imperdiet ac, ullamcorper quis ante. Nunc sed euismod elit, id consectetur dolor. Vivamus scelerisque sapien sit amet ligula varius, eu luctus sapien bibendum.'
                        ,'https://images.unsplash.com/photo-1478098711619-5ab0b478d6e6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80', default, 1, default ),

                        (null, 'title6', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor accumsan leo, vitae blandit metus ullamcorper vel. Curabitur velit massa, tempor eget elit ut, placerat ultricies ligula. Proin felis libero, malesuada vel imperdiet ac, ullamcorper quis ante. Nunc sed euismod elit, id consectetur dolor. Vivamus scelerisque sapien sit amet ligula varius, eu luctus sapien bibendum.'
                        ,'https://images.unsplash.com/photo-1478098711619-5ab0b478d6e6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80', default, 1, default ),

                        (null, 'title7', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor accumsan leo, vitae blandit metus ullamcorper vel. Curabitur velit massa, tempor eget elit ut, placerat ultricies ligula. Proin felis libero, malesuada vel imperdiet ac, ullamcorper quis ante. Nunc sed euismod elit, id consectetur dolor. Vivamus scelerisque sapien sit amet ligula varius, eu luctus sapien bibendum.'
                        ,'https://images.unsplash.com/photo-1478098711619-5ab0b478d6e6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80', default, 1, default ),

                        (null, 'title8', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor accumsan leo, vitae blandit metus ullamcorper vel. Curabitur velit massa, tempor eget elit ut, placerat ultricies ligula. Proin felis libero, malesuada vel imperdiet ac, ullamcorper quis ante. Nunc sed euismod elit, id consectetur dolor. Vivamus scelerisque sapien sit amet ligula varius, eu luctus sapien bibendum.'
                        ,'https://images.unsplash.com/photo-1478098711619-5ab0b478d6e6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80', default, 1, default ),

                        (null, 'title9', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor accumsan leo, vitae blandit metus ullamcorper vel. Curabitur velit massa, tempor eget elit ut, placerat ultricies ligula. Proin felis libero, malesuada vel imperdiet ac, ullamcorper quis ante. Nunc sed euismod elit, id consectetur dolor. Vivamus scelerisque sapien sit amet ligula varius, eu luctus sapien bibendum.'
                        ,'https://images.unsplash.com/photo-1478098711619-5ab0b478d6e6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80', default, 1, default ),

                        (null, 'title10', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor accumsan leo, vitae blandit metus ullamcorper vel. Curabitur velit massa, tempor eget elit ut, placerat ultricies ligula. Proin felis libero, malesuada vel imperdiet ac, ullamcorper quis ante. Nunc sed euismod elit, id consectetur dolor. Vivamus scelerisque sapien sit amet ligula varius, eu luctus sapien bibendum.'
                        ,'https://images.unsplash.com/photo-1478098711619-5ab0b478d6e6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80', default, 1, default ),

                        (null, 'title11', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor accumsan leo, vitae blandit metus ullamcorper vel. Curabitur velit massa, tempor eget elit ut, placerat ultricies ligula. Proin felis libero, malesuada vel imperdiet ac, ullamcorper quis ante. Nunc sed euismod elit, id consectetur dolor. Vivamus scelerisque sapien sit amet ligula varius, eu luctus sapien bibendum.'
                        ,'https://images.unsplash.com/photo-1478098711619-5ab0b478d6e6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80', default, 1, default ),

                        (null, 'title12', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor accumsan leo, vitae blandit metus ullamcorper vel. Curabitur velit massa, tempor eget elit ut, placerat ultricies ligula. Proin felis libero, malesuada vel imperdiet ac, ullamcorper quis ante. Nunc sed euismod elit, id consectetur dolor. Vivamus scelerisque sapien sit amet ligula varius, eu luctus sapien bibendum.'
                        ,'https://images.unsplash.com/photo-1478098711619-5ab0b478d6e6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80', default, 1, default ),

                        (null, 'title13', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor accumsan leo, vitae blandit metus ullamcorper vel. Curabitur velit massa, tempor eget elit ut, placerat ultricies ligula. Proin felis libero, malesuada vel imperdiet ac, ullamcorper quis ante. Nunc sed euismod elit, id consectetur dolor. Vivamus scelerisque sapien sit amet ligula varius, eu luctus sapien bibendum.'
                        ,'https://images.unsplash.com/photo-1478098711619-5ab0b478d6e6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80', default, 1, default ),

                        (null, 'title14', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed auctor accumsan leo, vitae blandit metus ullamcorper vel. Curabitur velit massa, tempor eget elit ut, placerat ultricies ligula. Proin felis libero, malesuada vel imperdiet ac, ullamcorper quis ante. Nunc sed euismod elit, id consectetur dolor. Vivamus scelerisque sapien sit amet ligula varius, eu luctus sapien bibendum.'
                        ,'https://images.unsplash.com/photo-1478098711619-5ab0b478d6e6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80', default, 1, default );
insert into tb_comment values
                           (null, 'Perfect Comment!', default, 1, 1, default),
                           (null, 'Perfect Comment!', default, 1, 1, default),
                           (null, 'Perfect Comment!', default, 1, 1, default),
                           (null, 'Perfect Comment!', default, 1, 1, default),
                           (null, 'Perfect Comment!', default, 1, 1, default),
                           (null, 'Perfect Comment!', default, 1, 1, default),
                           (null, 'Perfect Comment!', default, 1, 1, default);
