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

package com.aliyuncs.reid_cloud.transform.v20201029;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid_cloud.model.v20201029.DescribeCameraStatisticsResponse;
import com.aliyuncs.reid_cloud.model.v20201029.DescribeCameraStatisticsResponse.PvStatisticResult;
import com.aliyuncs.reid_cloud.model.v20201029.DescribeCameraStatisticsResponse.PvStatisticResult.Rect;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCameraStatisticsResponseUnmarshaller {

	public static DescribeCameraStatisticsResponse unmarshall(DescribeCameraStatisticsResponse describeCameraStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeCameraStatisticsResponse.setRequestId(_ctx.stringValue("DescribeCameraStatisticsResponse.RequestId"));
		describeCameraStatisticsResponse.setErrorCode(_ctx.stringValue("DescribeCameraStatisticsResponse.ErrorCode"));
		describeCameraStatisticsResponse.setErrorMessage(_ctx.stringValue("DescribeCameraStatisticsResponse.ErrorMessage"));
		describeCameraStatisticsResponse.setMessage(_ctx.stringValue("DescribeCameraStatisticsResponse.Message"));
		describeCameraStatisticsResponse.setCode(_ctx.stringValue("DescribeCameraStatisticsResponse.Code"));
		describeCameraStatisticsResponse.setDynamicCode(_ctx.stringValue("DescribeCameraStatisticsResponse.DynamicCode"));
		describeCameraStatisticsResponse.setSuccess(_ctx.booleanValue("DescribeCameraStatisticsResponse.Success"));
		describeCameraStatisticsResponse.setDynamicMessage(_ctx.stringValue("DescribeCameraStatisticsResponse.DynamicMessage"));

		List<PvStatisticResult> pvStatisticResults = new ArrayList<PvStatisticResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCameraStatisticsResponse.PvStatisticResults.Length"); i++) {
			PvStatisticResult pvStatisticResult = new PvStatisticResult();
			pvStatisticResult.setIpcId(_ctx.longValue("DescribeCameraStatisticsResponse.PvStatisticResults["+ i +"].IpcId"));
			pvStatisticResult.setMaxDataTime(_ctx.longValue("DescribeCameraStatisticsResponse.PvStatisticResults["+ i +"].MaxDataTime"));
			pvStatisticResult.setPvCount(_ctx.longValue("DescribeCameraStatisticsResponse.PvStatisticResults["+ i +"].PvCount"));
			pvStatisticResult.setPvType(_ctx.stringValue("DescribeCameraStatisticsResponse.PvStatisticResults["+ i +"].PvType"));
			pvStatisticResult.setLocationId(_ctx.longValue("DescribeCameraStatisticsResponse.PvStatisticResults["+ i +"].LocationId"));

			List<Rect> pvRects = new ArrayList<Rect>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCameraStatisticsResponse.PvStatisticResults["+ i +"].PvRects.Length"); j++) {
				Rect rect = new Rect();
				rect.setRight(_ctx.floatValue("DescribeCameraStatisticsResponse.PvStatisticResults["+ i +"].PvRects["+ j +"].Right"));
				rect.setLeft(_ctx.floatValue("DescribeCameraStatisticsResponse.PvStatisticResults["+ i +"].PvRects["+ j +"].Left"));
				rect.setTop(_ctx.floatValue("DescribeCameraStatisticsResponse.PvStatisticResults["+ i +"].PvRects["+ j +"].Top"));
				rect.setBottom(_ctx.floatValue("DescribeCameraStatisticsResponse.PvStatisticResults["+ i +"].PvRects["+ j +"].Bottom"));

				pvRects.add(rect);
			}
			pvStatisticResult.setPvRects(pvRects);

			pvStatisticResults.add(pvStatisticResult);
		}
		describeCameraStatisticsResponse.setPvStatisticResults(pvStatisticResults);
	 
	 	return describeCameraStatisticsResponse;
	}
}