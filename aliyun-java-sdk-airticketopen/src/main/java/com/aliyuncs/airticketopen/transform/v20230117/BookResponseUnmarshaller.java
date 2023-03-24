/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.airticketopen.transform.v20230117;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airticketopen.model.v20230117.BookResponse;
import com.aliyuncs.airticketopen.model.v20230117.BookResponse.Data;
import com.aliyuncs.airticketopen.model.v20230117.BookResponse.Data.Order_listItem;
import com.aliyuncs.airticketopen.model.v20230117.BookResponse.Error_data;
import com.aliyuncs.airticketopen.model.v20230117.BookResponse.Error_data.Order_listItem2;
import com.aliyuncs.transform.UnmarshallerContext;


public class BookResponseUnmarshaller {

	public static BookResponse unmarshall(BookResponse bookResponse, UnmarshallerContext _ctx) {
		
		bookResponse.setRequestId(_ctx.stringValue("BookResponse.RequestId"));
		bookResponse.setStatus(_ctx.integerValue("BookResponse.status"));
		bookResponse.setError_code(_ctx.stringValue("BookResponse.error_code"));
		bookResponse.setError_msg(_ctx.stringValue("BookResponse.error_msg"));
		bookResponse.setSuccess(_ctx.booleanValue("BookResponse.success"));

		Data data = new Data();

		List<Order_listItem> order_list = new ArrayList<Order_listItem>();
		for (int i = 0; i < _ctx.lengthValue("BookResponse.data.order_list.Length"); i++) {
			Order_listItem order_listItem = new Order_listItem();
			order_listItem.setOrder_num(_ctx.longValue("BookResponse.data.order_list["+ i +"].order_num"));

			order_list.add(order_listItem);
		}
		data.setOrder_list(order_list);
		bookResponse.setData(data);

		Error_data error_data = new Error_data();

		List<Order_listItem2> order_list1 = new ArrayList<Order_listItem2>();
		for (int i = 0; i < _ctx.lengthValue("BookResponse.error_data.order_list.Length"); i++) {
			Order_listItem2 order_listItem2 = new Order_listItem2();
			order_listItem2.setOrder_num(_ctx.longValue("BookResponse.error_data.order_list["+ i +"].order_num"));

			order_list1.add(order_listItem2);
		}
		error_data.setOrder_list1(order_list1);
		bookResponse.setError_data(error_data);
	 
	 	return bookResponse;
	}
}