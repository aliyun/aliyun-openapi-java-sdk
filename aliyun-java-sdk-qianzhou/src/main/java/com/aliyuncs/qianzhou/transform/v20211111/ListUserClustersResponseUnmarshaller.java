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

package com.aliyuncs.qianzhou.transform.v20211111;

import com.aliyuncs.qianzhou.model.v20211111.ListUserClustersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserClustersResponseUnmarshaller {

	public static ListUserClustersResponse unmarshall(ListUserClustersResponse listUserClustersResponse, UnmarshallerContext _ctx) {
		
		listUserClustersResponse.setRequestId(_ctx.stringValue("ListUserClustersResponse.requestId"));
	 
	 	return listUserClustersResponse;
	}
}