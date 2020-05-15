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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListDSTDependenciesResponse;
import com.aliyuncs.sofa.model.v20190815.ListDSTDependenciesResponse.DependenciesItem;
import com.aliyuncs.sofa.model.v20190815.ListDSTDependenciesResponse.DependenciesItem.InfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDSTDependenciesResponseUnmarshaller {

	public static ListDSTDependenciesResponse unmarshall(ListDSTDependenciesResponse listDSTDependenciesResponse, UnmarshallerContext _ctx) {
		
		listDSTDependenciesResponse.setRequestId(_ctx.stringValue("ListDSTDependenciesResponse.RequestId"));
		listDSTDependenciesResponse.setResultCode(_ctx.stringValue("ListDSTDependenciesResponse.ResultCode"));
		listDSTDependenciesResponse.setResultMessage(_ctx.stringValue("ListDSTDependenciesResponse.ResultMessage"));

		List<DependenciesItem> dependencies = new ArrayList<DependenciesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDSTDependenciesResponse.Dependencies.Length"); i++) {
			DependenciesItem dependenciesItem = new DependenciesItem();
			dependenciesItem.setRelation(_ctx.stringValue("ListDSTDependenciesResponse.Dependencies["+ i +"].Relation"));
			dependenciesItem.setType(_ctx.stringValue("ListDSTDependenciesResponse.Dependencies["+ i +"].Type"));

			List<InfoItem> info = new ArrayList<InfoItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDSTDependenciesResponse.Dependencies["+ i +"].Info.Length"); j++) {
				InfoItem infoItem = new InfoItem();
				infoItem.setKey(_ctx.stringValue("ListDSTDependenciesResponse.Dependencies["+ i +"].Info["+ j +"].Key"));
				infoItem.setValue(_ctx.stringValue("ListDSTDependenciesResponse.Dependencies["+ i +"].Info["+ j +"].Value"));

				info.add(infoItem);
			}
			dependenciesItem.setInfo(info);

			dependencies.add(dependenciesItem);
		}
		listDSTDependenciesResponse.setDependencies(dependencies);
	 
	 	return listDSTDependenciesResponse;
	}
}