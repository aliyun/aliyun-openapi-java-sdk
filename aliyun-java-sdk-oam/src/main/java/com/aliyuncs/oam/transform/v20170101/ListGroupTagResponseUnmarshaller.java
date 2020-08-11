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

package com.aliyuncs.oam.transform.v20170101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oam.model.v20170101.ListGroupTagResponse;
import com.aliyuncs.oam.model.v20170101.ListGroupTagResponse.OamMutexGroupTagResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupTagResponseUnmarshaller {

	public static ListGroupTagResponse unmarshall(ListGroupTagResponse listGroupTagResponse, UnmarshallerContext _ctx) {
		
		listGroupTagResponse.setRequestId(_ctx.stringValue("ListGroupTagResponse.RequestId"));
		listGroupTagResponse.setCode(_ctx.stringValue("ListGroupTagResponse.Code"));
		listGroupTagResponse.setMessage(_ctx.stringValue("ListGroupTagResponse.Message"));

		List<OamMutexGroupTagResult> data = new ArrayList<OamMutexGroupTagResult>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupTagResponse.Data.Length"); i++) {
			OamMutexGroupTagResult oamMutexGroupTagResult = new OamMutexGroupTagResult();
			oamMutexGroupTagResult.setGroupTagId(_ctx.stringValue("ListGroupTagResponse.Data["+ i +"].GroupTagId"));
			oamMutexGroupTagResult.setDescription(_ctx.stringValue("ListGroupTagResponse.Data["+ i +"].Description"));
			oamMutexGroupTagResult.setName(_ctx.stringValue("ListGroupTagResponse.Data["+ i +"].Name"));
			oamMutexGroupTagResult.setGmtCreated(_ctx.stringValue("ListGroupTagResponse.Data["+ i +"].GmtCreated"));
			oamMutexGroupTagResult.setGmtModified(_ctx.stringValue("ListGroupTagResponse.Data["+ i +"].GmtModified"));
			oamMutexGroupTagResult.setGmtExpired(_ctx.stringValue("ListGroupTagResponse.Data["+ i +"].GmtExpired"));
			oamMutexGroupTagResult.setUserId(_ctx.stringValue("ListGroupTagResponse.Data["+ i +"].UserId"));

			data.add(oamMutexGroupTagResult);
		}
		listGroupTagResponse.setData(data);
	 
	 	return listGroupTagResponse;
	}
}