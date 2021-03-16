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

import com.aliyuncs.ecsops.model.v20160401.OpsEccQueryNcSingleConfigResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsEccQueryNcSingleConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsEccQueryNcSingleConfigResponseUnmarshaller {

	public static OpsEccQueryNcSingleConfigResponse unmarshall(OpsEccQueryNcSingleConfigResponse opsEccQueryNcSingleConfigResponse, UnmarshallerContext _ctx) {
		
		opsEccQueryNcSingleConfigResponse.setRequestId(_ctx.stringValue("OpsEccQueryNcSingleConfigResponse.RequestId"));

		Data data = new Data();
		data.setCategory(_ctx.stringValue("OpsEccQueryNcSingleConfigResponse.Data.Category"));
		data.setGmtCreated(_ctx.stringValue("OpsEccQueryNcSingleConfigResponse.Data.GmtCreated"));
		data.setGmtModified(_ctx.stringValue("OpsEccQueryNcSingleConfigResponse.Data.GmtModified"));
		data.setId(_ctx.stringValue("OpsEccQueryNcSingleConfigResponse.Data.Id"));
		data.setItemName(_ctx.stringValue("OpsEccQueryNcSingleConfigResponse.Data.ItemName"));
		data.setItemType(_ctx.stringValue("OpsEccQueryNcSingleConfigResponse.Data.ItemType"));
		data.setItemValue(_ctx.stringValue("OpsEccQueryNcSingleConfigResponse.Data.ItemValue"));
		data.setSN(_ctx.stringValue("OpsEccQueryNcSingleConfigResponse.Data.SN"));
		data.setStatus(_ctx.stringValue("OpsEccQueryNcSingleConfigResponse.Data.Status"));
		data.setVersion(_ctx.integerValue("OpsEccQueryNcSingleConfigResponse.Data.Version"));
		opsEccQueryNcSingleConfigResponse.setData(data);
	 
	 	return opsEccQueryNcSingleConfigResponse;
	}
}