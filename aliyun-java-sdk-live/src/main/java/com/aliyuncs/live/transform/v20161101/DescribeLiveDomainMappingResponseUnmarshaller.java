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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainMappingResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainMappingResponse.LiveDomainModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainMappingResponseUnmarshaller {

	public static DescribeLiveDomainMappingResponse unmarshall(DescribeLiveDomainMappingResponse describeLiveDomainMappingResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainMappingResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainMappingResponse.RequestId"));

		List<LiveDomainModel> liveDomainModels = new ArrayList<LiveDomainModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainMappingResponse.LiveDomainModels.Length"); i++) {
			LiveDomainModel liveDomainModel = new LiveDomainModel();
			liveDomainModel.setDomainName(_ctx.stringValue("DescribeLiveDomainMappingResponse.LiveDomainModels["+ i +"].DomainName"));
			liveDomainModel.setType(_ctx.stringValue("DescribeLiveDomainMappingResponse.LiveDomainModels["+ i +"].Type"));

			liveDomainModels.add(liveDomainModel);
		}
		describeLiveDomainMappingResponse.setLiveDomainModels(liveDomainModels);
	 
	 	return describeLiveDomainMappingResponse;
	}
}