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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.CreatePolarxInstanceResponse;
import com.aliyuncs.polardbx.model.v20200202.CreatePolarxInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePolarxInstanceResponseUnmarshaller {

	public static CreatePolarxInstanceResponse unmarshall(CreatePolarxInstanceResponse createPolarxInstanceResponse, UnmarshallerContext _ctx) {
		
		createPolarxInstanceResponse.setRequestId(_ctx.stringValue("CreatePolarxInstanceResponse.RequestId"));
		createPolarxInstanceResponse.setSuccess(_ctx.booleanValue("CreatePolarxInstanceResponse.Success"));

		Data data = new Data();
		data.setOrderId(_ctx.longValue("CreatePolarxInstanceResponse.Data.OrderId"));

		List<String> drdsInstanceIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreatePolarxInstanceResponse.Data.DrdsInstanceIdList.Length"); i++) {
			drdsInstanceIdList.add(_ctx.stringValue("CreatePolarxInstanceResponse.Data.DrdsInstanceIdList["+ i +"]"));
		}
		data.setDrdsInstanceIdList(drdsInstanceIdList);
		createPolarxInstanceResponse.setData(data);
	 
	 	return createPolarxInstanceResponse;
	}
}