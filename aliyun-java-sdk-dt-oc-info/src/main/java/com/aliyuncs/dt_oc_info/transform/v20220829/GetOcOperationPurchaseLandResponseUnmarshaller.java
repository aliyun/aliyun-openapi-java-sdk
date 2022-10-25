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

package com.aliyuncs.dt_oc_info.transform.v20220829;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcOperationPurchaseLandResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcOperationPurchaseLandResponseUnmarshaller {

	public static GetOcOperationPurchaseLandResponse unmarshall(GetOcOperationPurchaseLandResponse getOcOperationPurchaseLandResponse, UnmarshallerContext _ctx) {
		
		getOcOperationPurchaseLandResponse.setRequestId(_ctx.stringValue("GetOcOperationPurchaseLandResponse.RequestId"));
		getOcOperationPurchaseLandResponse.setCode(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Code"));
		getOcOperationPurchaseLandResponse.setSuccess(_ctx.booleanValue("GetOcOperationPurchaseLandResponse.Success"));
		getOcOperationPurchaseLandResponse.setMessage(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Message"));
		getOcOperationPurchaseLandResponse.setTotalNum(_ctx.integerValue("GetOcOperationPurchaseLandResponse.TotalNum"));
		getOcOperationPurchaseLandResponse.setPageIndex(_ctx.integerValue("GetOcOperationPurchaseLandResponse.PageIndex"));
		getOcOperationPurchaseLandResponse.setPageNum(_ctx.integerValue("GetOcOperationPurchaseLandResponse.PageNum"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOcOperationPurchaseLandResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"]"));
		}
		getOcOperationPurchaseLandResponse.setData(data);
	 
	 	return getOcOperationPurchaseLandResponse;
	}
}