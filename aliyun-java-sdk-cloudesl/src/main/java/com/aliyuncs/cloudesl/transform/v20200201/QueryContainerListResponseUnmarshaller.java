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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.QueryContainerListResponse;
import com.aliyuncs.cloudesl.model.v20200201.QueryContainerListResponse.Container;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryContainerListResponseUnmarshaller {

	public static QueryContainerListResponse unmarshall(QueryContainerListResponse queryContainerListResponse, UnmarshallerContext _ctx) {
		
		queryContainerListResponse.setRequestId(_ctx.stringValue("QueryContainerListResponse.RequestId"));
		queryContainerListResponse.setSuccess(_ctx.booleanValue("QueryContainerListResponse.Success"));
		queryContainerListResponse.setMessage(_ctx.stringValue("QueryContainerListResponse.Message"));
		queryContainerListResponse.setErrorCode(_ctx.stringValue("QueryContainerListResponse.ErrorCode"));
		queryContainerListResponse.setErrorMessage(_ctx.stringValue("QueryContainerListResponse.ErrorMessage"));
		queryContainerListResponse.setCode(_ctx.stringValue("QueryContainerListResponse.Code"));
		queryContainerListResponse.setDynamicCode(_ctx.stringValue("QueryContainerListResponse.DynamicCode"));
		queryContainerListResponse.setDynamicMessage(_ctx.stringValue("QueryContainerListResponse.DynamicMessage"));
		queryContainerListResponse.setPageSize(_ctx.integerValue("QueryContainerListResponse.PageSize"));
		queryContainerListResponse.setPageNumber(_ctx.integerValue("QueryContainerListResponse.PageNumber"));
		queryContainerListResponse.setTotalCount(_ctx.integerValue("QueryContainerListResponse.TotalCount"));

		List<Container> containerList = new ArrayList<Container>();
		for (int i = 0; i < _ctx.lengthValue("QueryContainerListResponse.ContainerList.Length"); i++) {
			Container container = new Container();
			container.setContainerId(_ctx.stringValue("QueryContainerListResponse.ContainerList["+ i +"].ContainerId"));
			container.setContainerName(_ctx.stringValue("QueryContainerListResponse.ContainerList["+ i +"].ContainerName"));
			container.setDescription(_ctx.stringValue("QueryContainerListResponse.ContainerList["+ i +"].Description"));
			container.setTopPx(_ctx.integerValue("QueryContainerListResponse.ContainerList["+ i +"].TopPx"));
			container.setLeftPx(_ctx.integerValue("QueryContainerListResponse.ContainerList["+ i +"].LeftPx"));
			container.setWidthPx(_ctx.integerValue("QueryContainerListResponse.ContainerList["+ i +"].WidthPx"));
			container.setHeightPx(_ctx.integerValue("QueryContainerListResponse.ContainerList["+ i +"].HeightPx"));
			container.setGroupId(_ctx.stringValue("QueryContainerListResponse.ContainerList["+ i +"].GroupId"));
			container.setGroupName(_ctx.stringValue("QueryContainerListResponse.ContainerList["+ i +"].GroupName"));
			container.setDemoTemplateId(_ctx.stringValue("QueryContainerListResponse.ContainerList["+ i +"].DemoTemplateId"));
			container.setDemoTemplateName(_ctx.stringValue("QueryContainerListResponse.ContainerList["+ i +"].DemoTemplateName"));

			containerList.add(container);
		}
		queryContainerListResponse.setContainerList(containerList);
	 
	 	return queryContainerListResponse;
	}
}