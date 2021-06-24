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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeProjectResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsSlsDescribeProjectResponse.Projects;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSlsDescribeProjectResponseUnmarshaller {

	public static OpsSlsDescribeProjectResponse unmarshall(OpsSlsDescribeProjectResponse opsSlsDescribeProjectResponse, UnmarshallerContext _ctx) {
		
		opsSlsDescribeProjectResponse.setRequestId(_ctx.stringValue("OpsSlsDescribeProjectResponse.RequestId"));
		opsSlsDescribeProjectResponse.setMessage(_ctx.stringValue("OpsSlsDescribeProjectResponse.Message"));
		opsSlsDescribeProjectResponse.setCode(_ctx.stringValue("OpsSlsDescribeProjectResponse.Code"));
		opsSlsDescribeProjectResponse.setSuccess(_ctx.stringValue("OpsSlsDescribeProjectResponse.Success"));
		opsSlsDescribeProjectResponse.setPageSize(_ctx.longValue("OpsSlsDescribeProjectResponse.PageSize"));
		opsSlsDescribeProjectResponse.setTotal(_ctx.longValue("OpsSlsDescribeProjectResponse.Total"));
		opsSlsDescribeProjectResponse.setPageNo(_ctx.longValue("OpsSlsDescribeProjectResponse.PageNo"));

		List<Projects> data = new ArrayList<Projects>();
		for (int i = 0; i < _ctx.lengthValue("OpsSlsDescribeProjectResponse.Data.Length"); i++) {
			Projects projects = new Projects();
			projects.setProjectName(_ctx.stringValue("OpsSlsDescribeProjectResponse.Data["+ i +"].ProjectName"));
			projects.setProjectStatus(_ctx.stringValue("OpsSlsDescribeProjectResponse.Data["+ i +"].ProjectStatus"));
			projects.setProjectOwner(_ctx.stringValue("OpsSlsDescribeProjectResponse.Data["+ i +"].ProjectOwner"));
			projects.setProjectDesc(_ctx.stringValue("OpsSlsDescribeProjectResponse.Data["+ i +"].ProjectDesc"));
			projects.setRegion(_ctx.stringValue("OpsSlsDescribeProjectResponse.Data["+ i +"].Region"));
			projects.setCreateTime(_ctx.stringValue("OpsSlsDescribeProjectResponse.Data["+ i +"].CreateTime"));
			projects.setLastModifyTime(_ctx.stringValue("OpsSlsDescribeProjectResponse.Data["+ i +"].LastModifyTime"));

			data.add(projects);
		}
		opsSlsDescribeProjectResponse.setData(data);
	 
	 	return opsSlsDescribeProjectResponse;
	}
}