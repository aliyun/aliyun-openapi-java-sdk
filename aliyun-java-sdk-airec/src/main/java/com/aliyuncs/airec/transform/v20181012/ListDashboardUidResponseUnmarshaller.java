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

import com.aliyuncs.airec.model.v20181012.ListDashboardUidResponse;
import com.aliyuncs.airec.model.v20181012.ListDashboardUidResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDashboardUidResponseUnmarshaller {

	public static ListDashboardUidResponse unmarshall(ListDashboardUidResponse listDashboardUidResponse, UnmarshallerContext context) {
		
		listDashboardUidResponse.setRequestId(context.stringValue("ListDashboardUidResponse.RequestId"));
		listDashboardUidResponse.setCode(context.stringValue("ListDashboardUidResponse.Code"));
		listDashboardUidResponse.setMessage(context.stringValue("ListDashboardUidResponse.Message"));

		Result result = new Result();
		result.setNum(context.integerValue("ListDashboardUidResponse.Result.Num"));

		List<String> uid = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListDashboardUidResponse.Result.Uid.Length"); i++) {
			uid.add(context.stringValue("ListDashboardUidResponse.Result.Uid["+ i +"]"));
		}
		result.setUid(uid);
		listDashboardUidResponse.setResult(result);
	 
	 	return listDashboardUidResponse;
	}
}