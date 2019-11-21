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

import com.aliyuncs.reid.model.v20190928.DescribeCameraStatisticResponse;
import com.aliyuncs.reid.model.v20190928.DescribeCameraStatisticResponse.PvStatisticResult;
import com.aliyuncs.reid.model.v20190928.DescribeCameraStatisticResponse.PvStatisticResult.Rect;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCameraStatisticResponseUnmarshaller {

	public static DescribeCameraStatisticResponse unmarshall(DescribeCameraStatisticResponse describeCameraStatisticResponse, UnmarshallerContext _ctx) {
		
		describeCameraStatisticResponse.setRequestId(_ctx.stringValue("DescribeCameraStatisticResponse.RequestId"));
		describeCameraStatisticResponse.setErrorCode(_ctx.stringValue("DescribeCameraStatisticResponse.ErrorCode"));
		describeCameraStatisticResponse.setErrorMessage(_ctx.stringValue("DescribeCameraStatisticResponse.ErrorMessage"));
		describeCameraStatisticResponse.setMessage(_ctx.stringValue("DescribeCameraStatisticResponse.Message"));
		describeCameraStatisticResponse.setCode(_ctx.stringValue("DescribeCameraStatisticResponse.Code"));
		describeCameraStatisticResponse.setDynamicCode(_ctx.stringValue("DescribeCameraStatisticResponse.DynamicCode"));
		describeCameraStatisticResponse.setSuccess(_ctx.booleanValue("DescribeCameraStatisticResponse.Success"));
		describeCameraStatisticResponse.setDynamicMessage(_ctx.stringValue("DescribeCameraStatisticResponse.DynamicMessage"));

		List<PvStatisticResult> pvStatisticResults = new ArrayList<PvStatisticResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCameraStatisticResponse.PvStatisticResults.Length"); i++) {
			PvStatisticResult pvStatisticResult = new PvStatisticResult();
			pvStatisticResult.setLocationId(_ctx.longValue("DescribeCameraStatisticResponse.PvStatisticResults["+ i +"].LocationId"));
			pvStatisticResult.setPvCount(_ctx.longValue("DescribeCameraStatisticResponse.PvStatisticResults["+ i +"].PvCount"));
			pvStatisticResult.setProcessCursor(_ctx.longValue("DescribeCameraStatisticResponse.PvStatisticResults["+ i +"].ProcessCursor"));
			pvStatisticResult.setIpcId(_ctx.longValue("DescribeCameraStatisticResponse.PvStatisticResults["+ i +"].IpcId"));

			List<Rect> pvRects = new ArrayList<Rect>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCameraStatisticResponse.PvStatisticResults["+ i +"].PvRects.Length"); j++) {
				Rect rect = new Rect();
				rect.setRight(_ctx.floatValue("DescribeCameraStatisticResponse.PvStatisticResults["+ i +"].PvRects["+ j +"].Right"));
				rect.setBottom(_ctx.floatValue("DescribeCameraStatisticResponse.PvStatisticResults["+ i +"].PvRects["+ j +"].Bottom"));
				rect.setLeft(_ctx.floatValue("DescribeCameraStatisticResponse.PvStatisticResults["+ i +"].PvRects["+ j +"].Left"));
				rect.setTop(_ctx.floatValue("DescribeCameraStatisticResponse.PvStatisticResults["+ i +"].PvRects["+ j +"].Top"));

				pvRects.add(rect);
			}
			pvStatisticResult.setPvRects(pvRects);

			pvStatisticResults.add(pvStatisticResult);
		}
		describeCameraStatisticResponse.setPvStatisticResults(pvStatisticResults);
	 
	 	return describeCameraStatisticResponse;
	}
}