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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.GetUpdateSaleInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUpdateSaleInfoResponseUnmarshaller {

	public static GetUpdateSaleInfoResponse unmarshall(GetUpdateSaleInfoResponse getUpdateSaleInfoResponse, UnmarshallerContext _ctx) {
		
		getUpdateSaleInfoResponse.setRequestId(_ctx.stringValue("GetUpdateSaleInfoResponse.RequestId"));
		getUpdateSaleInfoResponse.setSuccess(_ctx.booleanValue("GetUpdateSaleInfoResponse.Success"));
		getUpdateSaleInfoResponse.setCommodityCode(_ctx.stringValue("GetUpdateSaleInfoResponse.CommodityCode"));
		getUpdateSaleInfoResponse.setInstanceId(_ctx.stringValue("GetUpdateSaleInfoResponse.InstanceId"));

		List<String> skuList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetUpdateSaleInfoResponse.SkuList.Length"); i++) {
			skuList.add(_ctx.stringValue("GetUpdateSaleInfoResponse.SkuList["+ i +"]"));
		}
		getUpdateSaleInfoResponse.setSkuList(skuList);
	 
	 	return getUpdateSaleInfoResponse;
	}
}