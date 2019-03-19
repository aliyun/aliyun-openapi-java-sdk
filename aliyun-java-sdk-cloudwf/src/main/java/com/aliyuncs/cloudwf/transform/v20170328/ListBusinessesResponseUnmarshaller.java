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

package com.aliyuncs.cloudwf.transform.v20170328;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudwf.model.v20170328.ListBusinessesResponse;
import com.aliyuncs.cloudwf.model.v20170328.ListBusinessesResponse.BusinessInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBusinessesResponseUnmarshaller {

	public static ListBusinessesResponse unmarshall(ListBusinessesResponse listBusinessesResponse, UnmarshallerContext context) {
		
		listBusinessesResponse.setRequestId(context.stringValue("ListBusinessesResponse.RequestId"));
		listBusinessesResponse.setSuccess(context.booleanValue("ListBusinessesResponse.Success"));
		listBusinessesResponse.setMessage(context.stringValue("ListBusinessesResponse.Message"));
		listBusinessesResponse.setErrorCode(context.integerValue("ListBusinessesResponse.ErrorCode"));

		List<BusinessInfo> data = new ArrayList<BusinessInfo>();
		for (int i = 0; i < context.lengthValue("ListBusinessesResponse.data.Length"); i++) {
			BusinessInfo businessInfo = new BusinessInfo();
			businessInfo.setText(context.stringValue("ListBusinessesResponse.data["+ i +"].text"));
			businessInfo.setValue(context.stringValue("ListBusinessesResponse.data["+ i +"].value"));

			data.add(businessInfo);
		}
		listBusinessesResponse.setData(data);
	 
	 	return listBusinessesResponse;
	}
}