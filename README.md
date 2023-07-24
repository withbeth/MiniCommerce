# MiniCommerce
나만의 주문서비스 아키텍처 구성 스터디


docker-compose up -d 


# 도메인 
1. Item
2. Order
3. Shop
4. Discount
   
# Mini Commerce의 기본 useCase

1. order에서 주문이 들어온다
2. order에 포함된 주문정보(shop, item, discount)에 따라 아이템 재고를 차감한다
    
