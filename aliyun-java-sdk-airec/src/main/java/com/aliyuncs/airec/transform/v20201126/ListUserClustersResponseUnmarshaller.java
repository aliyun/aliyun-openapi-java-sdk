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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListUserClustersResponse;
import com.aliyuncs.airec.model.v20201126.ListUserClustersResponse.Headers;
import com.aliyuncs.airec.model.v20201126.ListUserClustersResponse.UserCluster;
import com.aliyuncs.airec.model.v20201126.ListUserClustersResponse.UserCluster.Meta;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserClustersResponseUnmarshaller {

	public static ListUserClustersResponse unmarshall(ListUserClustersResponse listUserClustersResponse, UnmarshallerContext _ctx) {
		
		listUserClustersResponse.setRequestId(_ctx.stringValue("ListUserClustersResponse.requestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListUserClustersResponse.headers.X-Total-Count"));
		listUserClustersResponse.setHeaders(headers);

		List<UserCluster> result = new ArrayList<UserCluster>();
		for (int i = 0; i < _ctx.lengthValue("ListUserClustersResponse.result.Length"); i++) {
			UserCluster userCluster = new UserCluster();
			userCluster.setName(_ctx.stringValue("ListUserClustersResponse.result["+ i +"].name"));
			userCluster.setStatus(_ctx.stringValue("ListUserClustersResponse.result["+ i +"].status"));
			userCluster.setGmtCreate(_ctx.stringValue("ListUserClustersResponse.result["+ i +"].gmtCreate"));
			userCluster.setGmtModified(_ctx.stringValue("ListUserClustersResponse.result["+ i +"].gmtModified"));

			Meta meta = new Meta();
			meta.setMetaType(_ctx.stringValue("ListUserClustersResponse.result["+ i +"].meta.metaType"));
			meta.setDescription(_ctx.stringValue("ListUserClustersResponse.result["+ i +"].meta.description"));
			userCluster.setMeta(meta);

			result.add(userCluster);
		}
		listUserClustersResponse.setResult(result);
	 
	 	return listUserClustersResponse;
	}
}