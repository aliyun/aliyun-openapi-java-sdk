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

package com.aliyuncs.eflo.transform.v20220530;

import com.aliyuncs.eflo.model.v20220530.GetVpdResponse;
import com.aliyuncs.eflo.model.v20220530.GetVpdResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVpdResponseUnmarshaller {

	public static GetVpdResponse unmarshall(GetVpdResponse getVpdResponse, UnmarshallerContext _ctx) {
		
		getVpdResponse.setRequestId(_ctx.stringValue("GetVpdResponse.RequestId"));
		getVpdResponse.setCode(_ctx.integerValue("GetVpdResponse.Code"));
		getVpdResponse.setMessage(_ctx.stringValue("GetVpdResponse.Message"));

		Content content = new Content();
		content.setRegionId(_ctx.stringValue("GetVpdResponse.Content.RegionId"));
		content.setVpdId(_ctx.stringValue("GetVpdResponse.Content.VpdId"));
		content.setName(_ctx.stringValue("GetVpdResponse.Content.Name"));
		content.setCidr(_ctx.stringValue("GetVpdResponse.Content.Cidr"));
		content.setServiceCidr(_ctx.stringValue("GetVpdResponse.Content.ServiceCidr"));
		content.setStatus(_ctx.stringValue("GetVpdResponse.Content.Status"));
		content.setDescription(_ctx.stringValue("GetVpdResponse.Content.Description"));
		content.setMessage(_ctx.stringValue("GetVpdResponse.Content.Message"));
		content.setRoute(_ctx.integerValue("GetVpdResponse.Content.Route"));
		content.setNcCount(_ctx.longValue("GetVpdResponse.Content.NcCount"));
		content.setSubnetCount(_ctx.longValue("GetVpdResponse.Content.SubnetCount"));
		content.setLbCount(_ctx.longValue("GetVpdResponse.Content.LbCount"));
		content.setVccCount(_ctx.longValue("GetVpdResponse.Content.VccCount"));
		content.setGmtCreate(_ctx.stringValue("GetVpdResponse.Content.GmtCreate"));
		content.setGmtModified(_ctx.stringValue("GetVpdResponse.Content.GmtModified"));
		getVpdResponse.setContent(content);
	 
	 	return getVpdResponse;
	}
}