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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.ListInstanceResponse;
import com.aliyuncs.airec.model.v20181012.ListInstanceResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceResponseUnmarshaller {

	public static ListInstanceResponse unmarshall(ListInstanceResponse listInstanceResponse, UnmarshallerContext _ctx) {
		
		listInstanceResponse.setRequestId(_ctx.stringValue("ListInstanceResponse.RequestId"));
		listInstanceResponse.setCode(_ctx.stringValue("ListInstanceResponse.Code"));
		listInstanceResponse.setMessage(_ctx.stringValue("ListInstanceResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setInstanceId(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].InstanceId"));
			resultItem.setChargeType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].ChargeType"));
			resultItem.setRegionId(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].RegionId"));
			resultItem.setName(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].Name"));
			resultItem.setType(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].Type"));
			resultItem.setExpiredTime(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].ExpiredTime"));
			resultItem.setGmtCreate(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].GmtCreate"));
			resultItem.setGmtModified(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].GmtModified"));
			resultItem.setStatus(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].Status"));
			resultItem.setIndustry(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].Industry"));
			resultItem.setScene(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].Scene"));
			resultItem.setDataSetVersion(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].DataSetVersion"));
			resultItem.setCommodityCode(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].CommodityCode"));
			resultItem.setLockMode(_ctx.stringValue("ListInstanceResponse.Result["+ i +"].LockMode"));

			result.add(resultItem);
		}
		listInstanceResponse.setResult(result);
	 
	 	return listInstanceResponse;
	}
}