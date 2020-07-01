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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineInstanceInfoResponse;
import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineInstanceInfoResponse.Object;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPipelineInstanceInfoResponseUnmarshaller {

	public static GetPipelineInstanceInfoResponse unmarshall(GetPipelineInstanceInfoResponse getPipelineInstanceInfoResponse, UnmarshallerContext _ctx) {
		
		getPipelineInstanceInfoResponse.setRequestId(_ctx.stringValue("GetPipelineInstanceInfoResponse.RequestId"));
		getPipelineInstanceInfoResponse.setErrorCode(_ctx.stringValue("GetPipelineInstanceInfoResponse.ErrorCode"));
		getPipelineInstanceInfoResponse.setErrorMessage(_ctx.stringValue("GetPipelineInstanceInfoResponse.ErrorMessage"));
		getPipelineInstanceInfoResponse.setSuccess(_ctx.booleanValue("GetPipelineInstanceInfoResponse.Success"));

		Object object = new Object();
		object.setStatus(_ctx.stringValue("GetPipelineInstanceInfoResponse.Object.Status"));
		object.setStartTime(_ctx.longValue("GetPipelineInstanceInfoResponse.Object.StartTime"));
		object.setEndTime(_ctx.longValue("GetPipelineInstanceInfoResponse.Object.EndTime"));
		object.setSources(_ctx.stringValue("GetPipelineInstanceInfoResponse.Object.Sources"));
		object.setEmployeeId(_ctx.stringValue("GetPipelineInstanceInfoResponse.Object.EmployeeId"));

		List<String> packageDownloadUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPipelineInstanceInfoResponse.Object.PackageDownloadUrls.Length"); i++) {
			packageDownloadUrls.add(_ctx.stringValue("GetPipelineInstanceInfoResponse.Object.PackageDownloadUrls["+ i +"]"));
		}
		object.setPackageDownloadUrls(packageDownloadUrls);

		List<String> dockerImages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPipelineInstanceInfoResponse.Object.DockerImages.Length"); i++) {
			dockerImages.add(_ctx.stringValue("GetPipelineInstanceInfoResponse.Object.DockerImages["+ i +"]"));
		}
		object.setDockerImages(dockerImages);
		getPipelineInstanceInfoResponse.setObject(object);
	 
	 	return getPipelineInstanceInfoResponse;
	}
}