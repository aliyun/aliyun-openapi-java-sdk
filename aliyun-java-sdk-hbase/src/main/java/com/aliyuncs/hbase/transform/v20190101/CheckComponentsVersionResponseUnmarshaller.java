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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.CheckComponentsVersionResponse;
import com.aliyuncs.hbase.model.v20190101.CheckComponentsVersionResponse.Component;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckComponentsVersionResponseUnmarshaller {

	public static CheckComponentsVersionResponse unmarshall(CheckComponentsVersionResponse checkComponentsVersionResponse, UnmarshallerContext _ctx) {
		
		checkComponentsVersionResponse.setRequestId(_ctx.stringValue("CheckComponentsVersionResponse.RequestId"));

		List<Component> components = new ArrayList<Component>();
		for (int i = 0; i < _ctx.lengthValue("CheckComponentsVersionResponse.Components.Length"); i++) {
			Component component = new Component();
			component.setComponent(_ctx.stringValue("CheckComponentsVersionResponse.Components["+ i +"].Component"));
			component.setIsLatestVersion(_ctx.stringValue("CheckComponentsVersionResponse.Components["+ i +"].IsLatestVersion"));

			components.add(component);
		}
		checkComponentsVersionResponse.setComponents(components);
	 
	 	return checkComponentsVersionResponse;
	}
}