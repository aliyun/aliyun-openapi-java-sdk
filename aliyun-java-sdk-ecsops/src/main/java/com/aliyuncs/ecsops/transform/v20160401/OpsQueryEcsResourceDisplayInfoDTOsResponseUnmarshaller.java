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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryEcsResourceDisplayInfoDTOsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryEcsResourceDisplayInfoDTOsResponse.EcsResourceDisplayInfoDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryEcsResourceDisplayInfoDTOsResponseUnmarshaller {

	public static OpsQueryEcsResourceDisplayInfoDTOsResponse unmarshall(OpsQueryEcsResourceDisplayInfoDTOsResponse opsQueryEcsResourceDisplayInfoDTOsResponse, UnmarshallerContext _ctx) {
		
		opsQueryEcsResourceDisplayInfoDTOsResponse.setRequestId(_ctx.stringValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.RequestId"));
		opsQueryEcsResourceDisplayInfoDTOsResponse.setCode(_ctx.stringValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.Code"));
		opsQueryEcsResourceDisplayInfoDTOsResponse.setMessage(_ctx.stringValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.Message"));
		opsQueryEcsResourceDisplayInfoDTOsResponse.setSuccess(_ctx.booleanValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.Success"));

		List<EcsResourceDisplayInfoDTO> ecsResourceDisplayInfoDTOs = new ArrayList<EcsResourceDisplayInfoDTO>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.EcsResourceDisplayInfoDTOs.Length"); i++) {
			EcsResourceDisplayInfoDTO ecsResourceDisplayInfoDTO = new EcsResourceDisplayInfoDTO();
			ecsResourceDisplayInfoDTO.setId(_ctx.longValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.EcsResourceDisplayInfoDTOs["+ i +"].Id"));
			ecsResourceDisplayInfoDTO.setGmtCreate(_ctx.stringValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.EcsResourceDisplayInfoDTOs["+ i +"].GmtCreate"));
			ecsResourceDisplayInfoDTO.setGmtModified(_ctx.stringValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.EcsResourceDisplayInfoDTOs["+ i +"].GmtModified"));
			ecsResourceDisplayInfoDTO.setScope(_ctx.stringValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.EcsResourceDisplayInfoDTOs["+ i +"].Scope"));
			ecsResourceDisplayInfoDTO.setType(_ctx.stringValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.EcsResourceDisplayInfoDTOs["+ i +"].Type"));
			ecsResourceDisplayInfoDTO.setLevel(_ctx.stringValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.EcsResourceDisplayInfoDTOs["+ i +"].Level"));
			ecsResourceDisplayInfoDTO.setParentId(_ctx.longValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.EcsResourceDisplayInfoDTOs["+ i +"].ParentId"));
			ecsResourceDisplayInfoDTO.setValue(_ctx.stringValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.EcsResourceDisplayInfoDTOs["+ i +"].Value"));
			ecsResourceDisplayInfoDTO.setSubIds(_ctx.stringValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.EcsResourceDisplayInfoDTOs["+ i +"].SubIds"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.EcsResourceDisplayInfoDTOs["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("OpsQueryEcsResourceDisplayInfoDTOsResponse.EcsResourceDisplayInfoDTOs["+ i +"].Tags["+ j +"]"));
			}
			ecsResourceDisplayInfoDTO.setTags(tags);

			ecsResourceDisplayInfoDTOs.add(ecsResourceDisplayInfoDTO);
		}
		opsQueryEcsResourceDisplayInfoDTOsResponse.setEcsResourceDisplayInfoDTOs(ecsResourceDisplayInfoDTOs);
	 
	 	return opsQueryEcsResourceDisplayInfoDTOsResponse;
	}
}