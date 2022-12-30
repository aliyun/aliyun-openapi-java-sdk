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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo.model.v20220530.ListVpdsResponse;
import com.aliyuncs.eflo.model.v20220530.ListVpdsResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListVpdsResponse.Content.DataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpdsResponseUnmarshaller {

	public static ListVpdsResponse unmarshall(ListVpdsResponse listVpdsResponse, UnmarshallerContext _ctx) {
		
		listVpdsResponse.setRequestId(_ctx.stringValue("ListVpdsResponse.RequestId"));
		listVpdsResponse.setCode(_ctx.integerValue("ListVpdsResponse.Code"));
		listVpdsResponse.setMessage(_ctx.stringValue("ListVpdsResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListVpdsResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVpdsResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegionId(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setVpdId(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].VpdId"));
			dataItem.setName(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].Name"));
			dataItem.setCidr(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].Cidr"));
			dataItem.setServiceCidr(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].ServiceCidr"));
			dataItem.setStatus(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].Status"));
			dataItem.setMessage(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].Message"));
			dataItem.setRoute(_ctx.integerValue("ListVpdsResponse.Content.Data["+ i +"].Route"));
			dataItem.setNcCount(_ctx.integerValue("ListVpdsResponse.Content.Data["+ i +"].NcCount"));
			dataItem.setSubnetCount(_ctx.integerValue("ListVpdsResponse.Content.Data["+ i +"].SubnetCount"));
			dataItem.setGmtCreate(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListVpdsResponse.Content.Data["+ i +"].GmtModified"));
			dataItem.setDependence(_ctx.mapValue("ListVpdsResponse.Content.Data["+ i +"].Dependence"));

			data.add(dataItem);
		}
		content.setData(data);
		listVpdsResponse.setContent(content);
	 
	 	return listVpdsResponse;
	}
}