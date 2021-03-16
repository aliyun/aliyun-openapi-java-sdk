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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsConsistencyCheckServiceResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsConsistencyCheckServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsConsistencyCheckServiceResponseUnmarshaller {

	public static OpsConsistencyCheckServiceResponse unmarshall(OpsConsistencyCheckServiceResponse opsConsistencyCheckServiceResponse, UnmarshallerContext _ctx) {
		
		opsConsistencyCheckServiceResponse.setRequestId(_ctx.stringValue("OpsConsistencyCheckServiceResponse.RequestId"));

		Data data = new Data();
		data.setConsist(_ctx.booleanValue("OpsConsistencyCheckServiceResponse.Data.Consist"));
		data.setCheckCode(_ctx.stringValue("OpsConsistencyCheckServiceResponse.Data.CheckCode"));

		List<String> dataFeatures = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsConsistencyCheckServiceResponse.Data.DataFeatures.Length"); i++) {
			dataFeatures.add(_ctx.stringValue("OpsConsistencyCheckServiceResponse.Data.DataFeatures["+ i +"]"));
		}
		data.setDataFeatures(dataFeatures);

		List<String> abnormalAttrs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsConsistencyCheckServiceResponse.Data.AbnormalAttrs.Length"); i++) {
			abnormalAttrs.add(_ctx.stringValue("OpsConsistencyCheckServiceResponse.Data.AbnormalAttrs["+ i +"]"));
		}
		data.setAbnormalAttrs(abnormalAttrs);
		opsConsistencyCheckServiceResponse.setData(data);
	 
	 	return opsConsistencyCheckServiceResponse;
	}
}