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

package com.aliyuncs.cloudauth.transform.v20190307;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth.model.v20190307.DescribeFaceUsageResponse;
import com.aliyuncs.cloudauth.model.v20190307.DescribeFaceUsageResponse.FaceUsage;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFaceUsageResponseUnmarshaller {

	public static DescribeFaceUsageResponse unmarshall(DescribeFaceUsageResponse describeFaceUsageResponse, UnmarshallerContext _ctx) {
		
		describeFaceUsageResponse.setRequestId(_ctx.stringValue("DescribeFaceUsageResponse.RequestId"));
		describeFaceUsageResponse.setTotalCount(_ctx.integerValue("DescribeFaceUsageResponse.TotalCount"));

		List<FaceUsage> faceUsageList = new ArrayList<FaceUsage>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFaceUsageResponse.FaceUsageList.Length"); i++) {
			FaceUsage faceUsage = new FaceUsage();
			faceUsage.setDate(_ctx.stringValue("DescribeFaceUsageResponse.FaceUsageList["+ i +"].Date"));
			faceUsage.setTotalCount(_ctx.longValue("DescribeFaceUsageResponse.FaceUsageList["+ i +"].TotalCount"));

			faceUsageList.add(faceUsage);
		}
		describeFaceUsageResponse.setFaceUsageList(faceUsageList);
	 
	 	return describeFaceUsageResponse;
	}
}