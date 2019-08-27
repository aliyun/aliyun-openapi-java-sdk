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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.GetMetadataTypeListResponse;
import com.aliyuncs.emr.model.v20160408.GetMetadataTypeListResponse.SupportedMetadataTypeDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetadataTypeListResponseUnmarshaller {

	public static GetMetadataTypeListResponse unmarshall(GetMetadataTypeListResponse getMetadataTypeListResponse, UnmarshallerContext _ctx) {
		
		getMetadataTypeListResponse.setRequestId(_ctx.stringValue("GetMetadataTypeListResponse.RequestId"));

		List<SupportedMetadataTypeDTO> data = new ArrayList<SupportedMetadataTypeDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetMetadataTypeListResponse.Data.Length"); i++) {
			SupportedMetadataTypeDTO supportedMetadataTypeDTO = new SupportedMetadataTypeDTO();

			List<String> name = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetMetadataTypeListResponse.Data["+ i +"].Name.Length"); j++) {
				name.add(_ctx.stringValue("GetMetadataTypeListResponse.Data["+ i +"].Name["+ j +"]"));
			}
			supportedMetadataTypeDTO.setName(name);

			List<String> serviceName = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetMetadataTypeListResponse.Data["+ i +"].ServiceName.Length"); j++) {
				serviceName.add(_ctx.stringValue("GetMetadataTypeListResponse.Data["+ i +"].ServiceName["+ j +"]"));
			}
			supportedMetadataTypeDTO.setServiceName(serviceName);

			data.add(supportedMetadataTypeDTO);
		}
		getMetadataTypeListResponse.setData(data);
	 
	 	return getMetadataTypeListResponse;
	}
}