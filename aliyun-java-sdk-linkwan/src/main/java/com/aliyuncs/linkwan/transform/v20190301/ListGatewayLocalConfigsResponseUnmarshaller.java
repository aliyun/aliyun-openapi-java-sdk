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

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.ListGatewayLocalConfigsResponse;
import com.aliyuncs.linkwan.model.v20190301.ListGatewayLocalConfigsResponse.D2dConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayLocalConfigsResponseUnmarshaller {

	public static ListGatewayLocalConfigsResponse unmarshall(ListGatewayLocalConfigsResponse listGatewayLocalConfigsResponse, UnmarshallerContext _ctx) {
		
		listGatewayLocalConfigsResponse.setRequestId(_ctx.stringValue("ListGatewayLocalConfigsResponse.RequestId"));
		listGatewayLocalConfigsResponse.setSuccess(_ctx.booleanValue("ListGatewayLocalConfigsResponse.Success"));
		listGatewayLocalConfigsResponse.setCode(_ctx.stringValue("ListGatewayLocalConfigsResponse.Code"));
		listGatewayLocalConfigsResponse.setErrorMessage(_ctx.stringValue("ListGatewayLocalConfigsResponse.ErrorMessage"));

		List<D2dConfig> data = new ArrayList<D2dConfig>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewayLocalConfigsResponse.Data.Length"); i++) {
			D2dConfig d2dConfig = new D2dConfig();
			d2dConfig.setDevType(_ctx.stringValue("ListGatewayLocalConfigsResponse.Data["+ i +"].DevType"));
			d2dConfig.setEui(_ctx.stringValue("ListGatewayLocalConfigsResponse.Data["+ i +"].Eui"));
			d2dConfig.setD2dAddr(_ctx.stringValue("ListGatewayLocalConfigsResponse.Data["+ i +"].D2dAddr"));
			d2dConfig.setD2dKey(_ctx.stringValue("ListGatewayLocalConfigsResponse.Data["+ i +"].D2dKey"));
			d2dConfig.setFreq(_ctx.integerValue("ListGatewayLocalConfigsResponse.Data["+ i +"].Freq"));
			d2dConfig.setDatr(_ctx.integerValue("ListGatewayLocalConfigsResponse.Data["+ i +"].Datr"));
			d2dConfig.setTaskId(_ctx.longValue("ListGatewayLocalConfigsResponse.Data["+ i +"].TaskId"));
			d2dConfig.setCreateMillis(_ctx.longValue("ListGatewayLocalConfigsResponse.Data["+ i +"].CreateMillis"));
			d2dConfig.setModifiedMillis(_ctx.longValue("ListGatewayLocalConfigsResponse.Data["+ i +"].ModifiedMillis"));

			data.add(d2dConfig);
		}
		listGatewayLocalConfigsResponse.setData(data);
	 
	 	return listGatewayLocalConfigsResponse;
	}
}