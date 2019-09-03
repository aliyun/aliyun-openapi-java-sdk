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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.CheckResourceResponse;
import com.aliyuncs.rds.model.v20140815.CheckResourceResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckResourceResponseUnmarshaller {

	public static CheckResourceResponse unmarshall(CheckResourceResponse checkResourceResponse, UnmarshallerContext _ctx) {
		
		checkResourceResponse.setRequestId(_ctx.stringValue("CheckResourceResponse.RequestId"));
		checkResourceResponse.setSpecifyCount(_ctx.stringValue("CheckResourceResponse.SpecifyCount"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("CheckResourceResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setDBInstanceAvailable(_ctx.stringValue("CheckResourceResponse.Resources["+ i +"].DBInstanceAvailable"));
			resource.setEngine(_ctx.stringValue("CheckResourceResponse.Resources["+ i +"].Engine"));
			resource.setEngineVersion(_ctx.stringValue("CheckResourceResponse.Resources["+ i +"].EngineVersion"));

			resources.add(resource);
		}
		checkResourceResponse.setResources(resources);
	 
	 	return checkResourceResponse;
	}
}