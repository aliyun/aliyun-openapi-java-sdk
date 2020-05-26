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

package com.aliyuncs.datav_outer.transform.v20190402;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datav_outer.model.v20190402.ListScreenByWorkspaceResponse;
import com.aliyuncs.datav_outer.model.v20190402.ListScreenByWorkspaceResponse.ScreenInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScreenByWorkspaceResponseUnmarshaller {

	public static ListScreenByWorkspaceResponse unmarshall(ListScreenByWorkspaceResponse listScreenByWorkspaceResponse, UnmarshallerContext _ctx) {
		
		listScreenByWorkspaceResponse.setRequestId(_ctx.stringValue("ListScreenByWorkspaceResponse.RequestId"));

		List<ScreenInstance> screenInstances = new ArrayList<ScreenInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListScreenByWorkspaceResponse.ScreenInstances.Length"); i++) {
			ScreenInstance screenInstance = new ScreenInstance();
			screenInstance.setID(_ctx.stringValue("ListScreenByWorkspaceResponse.ScreenInstances["+ i +"].ID"));
			screenInstance.setTemplate(_ctx.stringValue("ListScreenByWorkspaceResponse.ScreenInstances["+ i +"].Template"));
			screenInstance.setThumbnail(_ctx.stringValue("ListScreenByWorkspaceResponse.ScreenInstances["+ i +"].Thumbnail"));
			screenInstance.setUpdatedAt(_ctx.stringValue("ListScreenByWorkspaceResponse.ScreenInstances["+ i +"].UpdatedAt"));
			screenInstance.setCreatedAt(_ctx.stringValue("ListScreenByWorkspaceResponse.ScreenInstances["+ i +"].CreatedAt"));
			screenInstance.setName(_ctx.stringValue("ListScreenByWorkspaceResponse.ScreenInstances["+ i +"].Name"));
			screenInstance.setShareUrl(_ctx.stringValue("ListScreenByWorkspaceResponse.ScreenInstances["+ i +"].ShareUrl"));

			screenInstances.add(screenInstance);
		}
		listScreenByWorkspaceResponse.setScreenInstances(screenInstances);
	 
	 	return listScreenByWorkspaceResponse;
	}
}