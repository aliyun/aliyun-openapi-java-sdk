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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.GetHitCountResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.GetHitCountResponse.HitsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHitCountResponseUnmarshaller {

	public static GetHitCountResponse unmarshall(GetHitCountResponse getHitCountResponse, UnmarshallerContext _ctx) {
		
		getHitCountResponse.setRequestId(_ctx.stringValue("GetHitCountResponse.RequestId"));
		getHitCountResponse.setCode(_ctx.stringValue("GetHitCountResponse.Code"));
		getHitCountResponse.setMessage(_ctx.stringValue("GetHitCountResponse.Message"));
		getHitCountResponse.setSuccess(_ctx.booleanValue("GetHitCountResponse.Success"));

		List<HitsItem> hits = new ArrayList<HitsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetHitCountResponse.Hits.Length"); i++) {
			HitsItem hitsItem = new HitsItem();
			hitsItem.setCount(_ctx.floatValue("GetHitCountResponse.Hits["+ i +"].Count"));
			hitsItem.setHostIp(_ctx.stringValue("GetHitCountResponse.Hits["+ i +"].HostIp"));

			hits.add(hitsItem);
		}
		getHitCountResponse.setHits(hits);
	 
	 	return getHitCountResponse;
	}
}