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

package com.aliyuncs.reid.transform.v20190928;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid.model.v20190928.ListMaskDetectionResultsResponse;
import com.aliyuncs.reid.model.v20190928.ListMaskDetectionResultsResponse.DetectionResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMaskDetectionResultsResponseUnmarshaller {

	public static ListMaskDetectionResultsResponse unmarshall(ListMaskDetectionResultsResponse listMaskDetectionResultsResponse, UnmarshallerContext _ctx) {
		
		listMaskDetectionResultsResponse.setRequestId(_ctx.stringValue("ListMaskDetectionResultsResponse.RequestId"));
		listMaskDetectionResultsResponse.setErrorCode(_ctx.stringValue("ListMaskDetectionResultsResponse.ErrorCode"));
		listMaskDetectionResultsResponse.setErrorMessage(_ctx.stringValue("ListMaskDetectionResultsResponse.ErrorMessage"));
		listMaskDetectionResultsResponse.setPageNumber(_ctx.integerValue("ListMaskDetectionResultsResponse.PageNumber"));
		listMaskDetectionResultsResponse.setMessage(_ctx.stringValue("ListMaskDetectionResultsResponse.Message"));
		listMaskDetectionResultsResponse.setCode(_ctx.stringValue("ListMaskDetectionResultsResponse.Code"));
		listMaskDetectionResultsResponse.setTotalCount(_ctx.longValue("ListMaskDetectionResultsResponse.TotalCount"));
		listMaskDetectionResultsResponse.setDynamicCode(_ctx.stringValue("ListMaskDetectionResultsResponse.DynamicCode"));
		listMaskDetectionResultsResponse.setPageSize(_ctx.integerValue("ListMaskDetectionResultsResponse.PageSize"));
		listMaskDetectionResultsResponse.setSuccess(_ctx.booleanValue("ListMaskDetectionResultsResponse.Success"));
		listMaskDetectionResultsResponse.setDynamicMessage(_ctx.stringValue("ListMaskDetectionResultsResponse.DynamicMessage"));

		List<DetectionResult> maskDetectionResults = new ArrayList<DetectionResult>();
		for (int i = 0; i < _ctx.lengthValue("ListMaskDetectionResultsResponse.MaskDetectionResults.Length"); i++) {
			DetectionResult detectionResult = new DetectionResult();
			detectionResult.setPkId(_ctx.stringValue("ListMaskDetectionResultsResponse.MaskDetectionResults["+ i +"].PkId"));
			detectionResult.setScore(_ctx.stringValue("ListMaskDetectionResultsResponse.MaskDetectionResults["+ i +"].Score"));
			detectionResult.setLocationId(_ctx.longValue("ListMaskDetectionResultsResponse.MaskDetectionResults["+ i +"].LocationId"));
			detectionResult.setImageKey(_ctx.stringValue("ListMaskDetectionResultsResponse.MaskDetectionResults["+ i +"].ImageKey"));
			detectionResult.setId(_ctx.longValue("ListMaskDetectionResultsResponse.MaskDetectionResults["+ i +"].Id"));
			detectionResult.setIpcId(_ctx.stringValue("ListMaskDetectionResultsResponse.MaskDetectionResults["+ i +"].IpcId"));
			detectionResult.setMaskResult(_ctx.stringValue("ListMaskDetectionResultsResponse.MaskDetectionResults["+ i +"].MaskResult"));

			maskDetectionResults.add(detectionResult);
		}
		listMaskDetectionResultsResponse.setMaskDetectionResults(maskDetectionResults);
	 
	 	return listMaskDetectionResultsResponse;
	}
}