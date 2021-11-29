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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.ListDcdnRealTimeDeliveryProjectResponse;
import com.aliyuncs.dcdn.model.v20180115.ListDcdnRealTimeDeliveryProjectResponse.Projects;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDcdnRealTimeDeliveryProjectResponseUnmarshaller {

	public static ListDcdnRealTimeDeliveryProjectResponse unmarshall(ListDcdnRealTimeDeliveryProjectResponse listDcdnRealTimeDeliveryProjectResponse, UnmarshallerContext _ctx) {
		
		listDcdnRealTimeDeliveryProjectResponse.setRequestId(_ctx.stringValue("ListDcdnRealTimeDeliveryProjectResponse.RequestId"));
		listDcdnRealTimeDeliveryProjectResponse.setTotalCount(_ctx.integerValue("ListDcdnRealTimeDeliveryProjectResponse.TotalCount"));

		List<Projects> content = new ArrayList<Projects>();
		for (int i = 0; i < _ctx.lengthValue("ListDcdnRealTimeDeliveryProjectResponse.Content.Length"); i++) {
			Projects projects = new Projects();
			projects.setProjectName(_ctx.stringValue("ListDcdnRealTimeDeliveryProjectResponse.Content["+ i +"].ProjectName"));
			projects.setType(_ctx.stringValue("ListDcdnRealTimeDeliveryProjectResponse.Content["+ i +"].Type"));
			projects.setDomainName(_ctx.stringValue("ListDcdnRealTimeDeliveryProjectResponse.Content["+ i +"].DomainName"));
			projects.setFieldName(_ctx.stringValue("ListDcdnRealTimeDeliveryProjectResponse.Content["+ i +"].FieldName"));
			projects.setSamplingRate(_ctx.floatValue("ListDcdnRealTimeDeliveryProjectResponse.Content["+ i +"].SamplingRate"));
			projects.setDataCenter(_ctx.stringValue("ListDcdnRealTimeDeliveryProjectResponse.Content["+ i +"].DataCenter"));
			projects.setSLSRegion(_ctx.stringValue("ListDcdnRealTimeDeliveryProjectResponse.Content["+ i +"].SLSRegion"));
			projects.setSLSProject(_ctx.stringValue("ListDcdnRealTimeDeliveryProjectResponse.Content["+ i +"].SLSProject"));
			projects.setSLSLogStore(_ctx.stringValue("ListDcdnRealTimeDeliveryProjectResponse.Content["+ i +"].SLSLogStore"));
			projects.setBusinessType(_ctx.stringValue("ListDcdnRealTimeDeliveryProjectResponse.Content["+ i +"].BusinessType"));

			content.add(projects);
		}
		listDcdnRealTimeDeliveryProjectResponse.setContent(content);
	 
	 	return listDcdnRealTimeDeliveryProjectResponse;
	}
}