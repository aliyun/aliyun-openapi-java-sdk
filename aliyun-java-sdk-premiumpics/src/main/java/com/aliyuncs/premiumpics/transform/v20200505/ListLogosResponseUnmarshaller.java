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

package com.aliyuncs.premiumpics.transform.v20200505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.premiumpics.model.v20200505.ListLogosResponse;
import com.aliyuncs.premiumpics.model.v20200505.ListLogosResponse.Goods;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLogosResponseUnmarshaller {

	public static ListLogosResponse unmarshall(ListLogosResponse listLogosResponse, UnmarshallerContext _ctx) {
		
		listLogosResponse.setRequestId(_ctx.stringValue("ListLogosResponse.RequestId"));
		listLogosResponse.setSuccess(_ctx.booleanValue("ListLogosResponse.Success"));
		listLogosResponse.setVersion(_ctx.stringValue("ListLogosResponse.Version"));
		listLogosResponse.setNextPage(_ctx.integerValue("ListLogosResponse.NextPage"));
		listLogosResponse.setPageNumber(_ctx.integerValue("ListLogosResponse.PageNumber"));
		listLogosResponse.setLogoVersion(_ctx.stringValue("ListLogosResponse.LogoVersion"));

		List<Goods> data = new ArrayList<Goods>();
		for (int i = 0; i < _ctx.lengthValue("ListLogosResponse.Data.Length"); i++) {
			Goods goods = new Goods();
			goods.setGoodsId(_ctx.stringValue("ListLogosResponse.Data["+ i +"].GoodsId"));
			goods.setUrl(_ctx.stringValue("ListLogosResponse.Data["+ i +"].Url"));
			goods.setCollect(_ctx.integerValue("ListLogosResponse.Data["+ i +"].Collect"));

			data.add(goods);
		}
		listLogosResponse.setData(data);
	 
	 	return listLogosResponse;
	}
}