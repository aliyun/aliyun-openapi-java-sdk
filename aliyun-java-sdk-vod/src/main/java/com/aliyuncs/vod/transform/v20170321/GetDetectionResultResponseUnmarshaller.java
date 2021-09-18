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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetDetectionResultResponse;
import com.aliyuncs.vod.model.v20170321.GetDetectionResultResponse.DetectionResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDetectionResultResponseUnmarshaller {

	public static GetDetectionResultResponse unmarshall(GetDetectionResultResponse getDetectionResultResponse, UnmarshallerContext _ctx) {
		
		getDetectionResultResponse.setRequestId(_ctx.stringValue("GetDetectionResultResponse.RequestId"));

		List<DetectionResult> detectionResultList = new ArrayList<DetectionResult>();
		for (int i = 0; i < _ctx.lengthValue("GetDetectionResultResponse.DetectionResultList.Length"); i++) {
			DetectionResult detectionResult = new DetectionResult();
			detectionResult.setStatus(_ctx.stringValue("GetDetectionResultResponse.DetectionResultList["+ i +"].Status"));
			detectionResult.setPlatform(_ctx.stringValue("GetDetectionResultResponse.DetectionResultList["+ i +"].Platform"));
			detectionResult.setContentType(_ctx.stringValue("GetDetectionResultResponse.DetectionResultList["+ i +"].ContentType"));
			detectionResult.setCollectionTitle(_ctx.stringValue("GetDetectionResultResponse.DetectionResultList["+ i +"].CollectionTitle"));
			detectionResult.setCollectionUrl(_ctx.stringValue("GetDetectionResultResponse.DetectionResultList["+ i +"].CollectionUrl"));
			detectionResult.setCreateTime(_ctx.stringValue("GetDetectionResultResponse.DetectionResultList["+ i +"].CreateTime"));
			detectionResult.setUploader(_ctx.stringValue("GetDetectionResultResponse.DetectionResultList["+ i +"].Uploader"));
			detectionResult.setModifyTime(_ctx.stringValue("GetDetectionResultResponse.DetectionResultList["+ i +"].ModifyTime"));

			detectionResultList.add(detectionResult);
		}
		getDetectionResultResponse.setDetectionResultList(detectionResultList);
	 
	 	return getDetectionResultResponse;
	}
}