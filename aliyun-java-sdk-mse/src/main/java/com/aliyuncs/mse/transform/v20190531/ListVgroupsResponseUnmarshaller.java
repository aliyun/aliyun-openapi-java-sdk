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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListVgroupsResponse;
import com.aliyuncs.mse.model.v20190531.ListVgroupsResponse.Vgoups;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVgroupsResponseUnmarshaller {

	public static ListVgroupsResponse unmarshall(ListVgroupsResponse listVgroupsResponse, UnmarshallerContext _ctx) {
		
		listVgroupsResponse.setRequestId(_ctx.stringValue("ListVgroupsResponse.RequestId"));
		listVgroupsResponse.setHttpStatusCode(_ctx.integerValue("ListVgroupsResponse.HttpStatusCode"));
		listVgroupsResponse.setMessage(_ctx.stringValue("ListVgroupsResponse.Message"));
		listVgroupsResponse.setCode(_ctx.integerValue("ListVgroupsResponse.Code"));
		listVgroupsResponse.setSuccess(_ctx.booleanValue("ListVgroupsResponse.Success"));

		List<Vgoups> data = new ArrayList<Vgoups>();
		for (int i = 0; i < _ctx.lengthValue("ListVgroupsResponse.Data.Length"); i++) {
			Vgoups vgoups = new Vgoups();
			vgoups.setGmtCreate(_ctx.stringValue("ListVgroupsResponse.Data["+ i +"].GmtCreate"));
			vgoups.setGmtModified(_ctx.stringValue("ListVgroupsResponse.Data["+ i +"].GmtModified"));
			vgoups.setId(_ctx.longValue("ListVgroupsResponse.Data["+ i +"].Id"));
			vgoups.setName(_ctx.stringValue("ListVgroupsResponse.Data["+ i +"].Name"));
			vgoups.setNameServer(_ctx.stringValue("ListVgroupsResponse.Data["+ i +"].NameServer"));
			vgoups.setPrimaryUser(_ctx.stringValue("ListVgroupsResponse.Data["+ i +"].PrimaryUser"));
			vgoups.setRegion(_ctx.stringValue("ListVgroupsResponse.Data["+ i +"].Region"));
			vgoups.setSeataServerUniqueId(_ctx.stringValue("ListVgroupsResponse.Data["+ i +"].SeataServerUniqueId"));

			data.add(vgoups);
		}
		listVgroupsResponse.setData(data);
	 
	 	return listVgroupsResponse;
	}
}