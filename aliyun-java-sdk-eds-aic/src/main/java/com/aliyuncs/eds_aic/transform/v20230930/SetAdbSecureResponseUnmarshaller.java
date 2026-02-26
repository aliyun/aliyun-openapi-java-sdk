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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.SetAdbSecureResponse;
import com.aliyuncs.eds_aic.model.v20230930.SetAdbSecureResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetAdbSecureResponseUnmarshaller {

	public static SetAdbSecureResponse unmarshall(SetAdbSecureResponse setAdbSecureResponse, UnmarshallerContext _ctx) {
		
		setAdbSecureResponse.setRequestId(_ctx.stringValue("SetAdbSecureResponse.RequestId"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("SetAdbSecureResponse.Data.TotalCount"));
		data.setFailCount(_ctx.integerValue("SetAdbSecureResponse.Data.FailCount"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SetAdbSecureResponse.Data.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("SetAdbSecureResponse.Data.InstanceIds["+ i +"]"));
		}
		data.setInstanceIds(instanceIds);

		List<String> instanceGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SetAdbSecureResponse.Data.InstanceGroupIds.Length"); i++) {
			instanceGroupIds.add(_ctx.stringValue("SetAdbSecureResponse.Data.InstanceGroupIds["+ i +"]"));
		}
		data.setInstanceGroupIds(instanceGroupIds);
		setAdbSecureResponse.setData(data);
	 
	 	return setAdbSecureResponse;
	}
}