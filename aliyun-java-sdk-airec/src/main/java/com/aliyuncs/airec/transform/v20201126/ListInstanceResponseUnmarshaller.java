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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListInstanceResponse;
import com.aliyuncs.airec.model.v20201126.ListInstanceResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceResponseUnmarshaller {

	public static ListInstanceResponse unmarshall(ListInstanceResponse listInstanceResponse, UnmarshallerContext _ctx) {
		
		listInstanceResponse.setCode(_ctx.stringValue("ListInstanceResponse.code"));
		listInstanceResponse.setMessage(_ctx.stringValue("ListInstanceResponse.message"));
		listInstanceResponse.setRequestId(_ctx.stringValue("ListInstanceResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setChargeType(_ctx.stringValue("ListInstanceResponse.result["+ i +"].chargeType"));
			resultItem.setCommodityCode(_ctx.stringValue("ListInstanceResponse.result["+ i +"].commodityCode"));
			resultItem.setDataSetVersion(_ctx.stringValue("ListInstanceResponse.result["+ i +"].dataSetVersion"));
			resultItem.setExpiredTime(_ctx.stringValue("ListInstanceResponse.result["+ i +"].expiredTime"));
			resultItem.setGmtCreate(_ctx.stringValue("ListInstanceResponse.result["+ i +"].gmtCreate"));
			resultItem.setGmtModified(_ctx.stringValue("ListInstanceResponse.result["+ i +"].gmtModified"));
			resultItem.setIndustry(_ctx.stringValue("ListInstanceResponse.result["+ i +"].industry"));
			resultItem.setInstanceId(_ctx.stringValue("ListInstanceResponse.result["+ i +"].instanceId"));
			resultItem.setLockMode(_ctx.stringValue("ListInstanceResponse.result["+ i +"].lockMode"));
			resultItem.setName(_ctx.stringValue("ListInstanceResponse.result["+ i +"].name"));
			resultItem.setRegionId(_ctx.stringValue("ListInstanceResponse.result["+ i +"].regionId"));
			resultItem.setStatus(_ctx.stringValue("ListInstanceResponse.result["+ i +"].status"));
			resultItem.setType(_ctx.stringValue("ListInstanceResponse.result["+ i +"].type"));

			result.add(resultItem);
		}
		listInstanceResponse.setResult(result);
	 
	 	return listInstanceResponse;
	}
}