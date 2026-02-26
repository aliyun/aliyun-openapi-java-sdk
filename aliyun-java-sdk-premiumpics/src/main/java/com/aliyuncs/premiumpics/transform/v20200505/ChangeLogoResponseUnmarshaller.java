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

import com.aliyuncs.premiumpics.model.v20200505.ChangeLogoResponse;
import com.aliyuncs.premiumpics.model.v20200505.ChangeLogoResponse.Goods;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeLogoResponseUnmarshaller {

	public static ChangeLogoResponse unmarshall(ChangeLogoResponse changeLogoResponse, UnmarshallerContext _ctx) {
		
		changeLogoResponse.setRequestId(_ctx.stringValue("ChangeLogoResponse.RequestId"));
		changeLogoResponse.setSuccess(_ctx.booleanValue("ChangeLogoResponse.Success"));
		changeLogoResponse.setHttpStatusCode(_ctx.integerValue("ChangeLogoResponse.HttpStatusCode"));

		List<Goods> data = new ArrayList<Goods>();
		for (int i = 0; i < _ctx.lengthValue("ChangeLogoResponse.Data.Length"); i++) {
			Goods goods = new Goods();
			goods.setGoodsId(_ctx.stringValue("ChangeLogoResponse.Data["+ i +"].GoodsId"));
			goods.setUrl(_ctx.stringValue("ChangeLogoResponse.Data["+ i +"].Url"));
			goods.setCollect(_ctx.integerValue("ChangeLogoResponse.Data["+ i +"].Collect"));
			goods.setTagId(_ctx.integerValue("ChangeLogoResponse.Data["+ i +"].TagId"));
			goods.setEnableChangeColor(_ctx.booleanValue("ChangeLogoResponse.Data["+ i +"].EnableChangeColor"));
			goods.setEnableChangeFont(_ctx.booleanValue("ChangeLogoResponse.Data["+ i +"].EnableChangeFont"));
			goods.setEnableChangeIcon(_ctx.booleanValue("ChangeLogoResponse.Data["+ i +"].EnableChangeIcon"));
			goods.setEnableChangeLayout(_ctx.booleanValue("ChangeLogoResponse.Data["+ i +"].EnableChangeLayout"));

			data.add(goods);
		}
		changeLogoResponse.setData(data);
	 
	 	return changeLogoResponse;
	}
}