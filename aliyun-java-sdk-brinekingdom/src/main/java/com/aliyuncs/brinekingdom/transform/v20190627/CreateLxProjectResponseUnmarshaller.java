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

package com.aliyuncs.brinekingdom.transform.v20190627;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.brinekingdom.model.v20190627.CreateLxProjectResponse;
import com.aliyuncs.brinekingdom.model.v20190627.CreateLxProjectResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLxProjectResponseUnmarshaller {

	public static CreateLxProjectResponse unmarshall(CreateLxProjectResponse createLxProjectResponse, UnmarshallerContext _ctx) {
		
		createLxProjectResponse.setSuccess(_ctx.booleanValue("CreateLxProjectResponse.success"));
		createLxProjectResponse.setErrorCode(_ctx.stringValue("CreateLxProjectResponse.errorCode"));
		createLxProjectResponse.setMsg(_ctx.stringValue("CreateLxProjectResponse.msg"));
		createLxProjectResponse.setTotalItems(_ctx.longValue("CreateLxProjectResponse.totalItems"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateLxProjectResponse.data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setConstructionTeam(_ctx.stringValue("CreateLxProjectResponse.data["+ i +"].constructionTeam"));
			dataItem.setSourceNumber(_ctx.stringValue("CreateLxProjectResponse.data["+ i +"].sourceNumber"));
			dataItem.setProjectId(_ctx.longValue("CreateLxProjectResponse.data["+ i +"].projectId"));
			dataItem.setProjectNo(_ctx.stringValue("CreateLxProjectResponse.data["+ i +"].projectNo"));
			dataItem.setUser(_ctx.stringValue("CreateLxProjectResponse.data["+ i +"].user"));
			dataItem.setRemark(_ctx.stringValue("CreateLxProjectResponse.data["+ i +"].remark"));
			dataItem.setProjectSource(_ctx.stringValue("CreateLxProjectResponse.data["+ i +"].projectSource"));
			dataItem.setExtInfo(_ctx.stringValue("CreateLxProjectResponse.data["+ i +"].extInfo"));
			dataItem.setSystemSource(_ctx.stringValue("CreateLxProjectResponse.data["+ i +"].systemSource"));
			dataItem.setIsStanderProcess(_ctx.integerValue("CreateLxProjectResponse.data["+ i +"].isStanderProcess"));
			dataItem.setCancelProjectUrl(_ctx.stringValue("CreateLxProjectResponse.data["+ i +"].cancelProjectUrl"));
			dataItem.setSourceSystemUrl(_ctx.stringValue("CreateLxProjectResponse.data["+ i +"].sourceSystemUrl"));
			dataItem.setInitWiringUrl(_ctx.stringValue("CreateLxProjectResponse.data["+ i +"].initWiringUrl"));

			data.add(dataItem);
		}
		createLxProjectResponse.setData(data);
	 
	 	return createLxProjectResponse;
	}
}