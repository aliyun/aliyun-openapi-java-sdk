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

import com.aliyuncs.ecsops.model.v20160401.OpsEcsAnalyseVmStateByPassResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsEcsAnalyseVmStateByPassResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsEcsAnalyseVmStateByPassResponseUnmarshaller {

	public static OpsEcsAnalyseVmStateByPassResponse unmarshall(OpsEcsAnalyseVmStateByPassResponse opsEcsAnalyseVmStateByPassResponse, UnmarshallerContext _ctx) {
		
		opsEcsAnalyseVmStateByPassResponse.setRequestId(_ctx.stringValue("OpsEcsAnalyseVmStateByPassResponse.RequestId"));

		List<Item> dataList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("OpsEcsAnalyseVmStateByPassResponse.DataList.Length"); i++) {
			Item item = new Item();
			item.setStatus(_ctx.stringValue("OpsEcsAnalyseVmStateByPassResponse.DataList["+ i +"].Status"));
			item.setOfficialResponse(_ctx.stringValue("OpsEcsAnalyseVmStateByPassResponse.DataList["+ i +"].OfficialResponse"));
			item.setDescription(_ctx.stringValue("OpsEcsAnalyseVmStateByPassResponse.DataList["+ i +"].Description"));
			item.setErrorType(_ctx.stringValue("OpsEcsAnalyseVmStateByPassResponse.DataList["+ i +"].ErrorType"));
			item.setSolution(_ctx.stringValue("OpsEcsAnalyseVmStateByPassResponse.DataList["+ i +"].Solution"));
			item.setDetail(_ctx.stringValue("OpsEcsAnalyseVmStateByPassResponse.DataList["+ i +"].Detail"));

			dataList.add(item);
		}
		opsEcsAnalyseVmStateByPassResponse.setDataList(dataList);
	 
	 	return opsEcsAnalyseVmStateByPassResponse;
	}
}