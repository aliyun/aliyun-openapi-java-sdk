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

package com.aliyuncs.mpserverless.transform.v20190615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpserverless.model.v20190615.ListSpaceResponse;
import com.aliyuncs.mpserverless.model.v20190615.ListSpaceResponse.Space;
import com.aliyuncs.mpserverless.model.v20190615.ListSpaceResponse.Space.Label;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSpaceResponseUnmarshaller {

	public static ListSpaceResponse unmarshall(ListSpaceResponse listSpaceResponse, UnmarshallerContext _ctx) {
		
		listSpaceResponse.setRequestId(_ctx.stringValue("ListSpaceResponse.RequestId"));
		listSpaceResponse.setHttpStatusCode(_ctx.stringValue("ListSpaceResponse.HttpStatusCode"));
		listSpaceResponse.setSuccess(_ctx.booleanValue("ListSpaceResponse.Success"));
		listSpaceResponse.setCode(_ctx.stringValue("ListSpaceResponse.Code"));
		listSpaceResponse.setMessage(_ctx.stringValue("ListSpaceResponse.Message"));
		listSpaceResponse.setGmtCreate(_ctx.stringValue("ListSpaceResponse.GmtCreate"));
		listSpaceResponse.setCount(_ctx.integerValue("ListSpaceResponse.Count"));

		List<Space> spaces = new ArrayList<Space>();
		for (int i = 0; i < _ctx.lengthValue("ListSpaceResponse.Spaces.Length"); i++) {
			Space space = new Space();
			space.setSpaceId(_ctx.stringValue("ListSpaceResponse.Spaces["+ i +"].SpaceId"));
			space.setName(_ctx.stringValue("ListSpaceResponse.Spaces["+ i +"].Name"));
			space.setDesc(_ctx.stringValue("ListSpaceResponse.Spaces["+ i +"].Desc"));
			space.setStatus(_ctx.stringValue("ListSpaceResponse.Spaces["+ i +"].Status"));
			space.setGmtCreate(_ctx.longValue("ListSpaceResponse.Spaces["+ i +"].GmtCreate"));

			List<Label> labels = new ArrayList<Label>();
			for (int j = 0; j < _ctx.lengthValue("ListSpaceResponse.Spaces["+ i +"].Labels.Length"); j++) {
				Label label = new Label();
				label.setName(_ctx.stringValue("ListSpaceResponse.Spaces["+ i +"].Labels["+ j +"].Name"));
				label.setValue(_ctx.stringValue("ListSpaceResponse.Spaces["+ i +"].Labels["+ j +"].Value"));

				labels.add(label);
			}
			space.setLabels(labels);

			spaces.add(space);
		}
		listSpaceResponse.setSpaces(spaces);
	 
	 	return listSpaceResponse;
	}
}