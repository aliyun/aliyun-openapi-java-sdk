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

import com.aliyuncs.reid_cloud.model.v20201029.DescribePredictGroupResultResponse;
import com.aliyuncs.reid_cloud.model.v20201029.DescribePredictGroupResultResponse.PredictGroupResultDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePredictGroupResultResponseUnmarshaller {

	public static DescribePredictGroupResultResponse unmarshall(DescribePredictGroupResultResponse describePredictGroupResultResponse, UnmarshallerContext _ctx) {
		
		describePredictGroupResultResponse.setRequestId(_ctx.stringValue("DescribePredictGroupResultResponse.RequestId"));
		describePredictGroupResultResponse.setMessage(_ctx.stringValue("DescribePredictGroupResultResponse.Message"));
		describePredictGroupResultResponse.setCursorTime(_ctx.stringValue("DescribePredictGroupResultResponse.CursorTime"));
		describePredictGroupResultResponse.setDynamicCode(_ctx.stringValue("DescribePredictGroupResultResponse.DynamicCode"));
		describePredictGroupResultResponse.setErrorCode(_ctx.stringValue("DescribePredictGroupResultResponse.ErrorCode"));
		describePredictGroupResultResponse.setDynamicMessage(_ctx.stringValue("DescribePredictGroupResultResponse.DynamicMessage"));
		describePredictGroupResultResponse.setErrorMessage(_ctx.stringValue("DescribePredictGroupResultResponse.ErrorMessage"));
		describePredictGroupResultResponse.setCode(_ctx.stringValue("DescribePredictGroupResultResponse.Code"));
		describePredictGroupResultResponse.setTotalCount(_ctx.longValue("DescribePredictGroupResultResponse.TotalCount"));
		describePredictGroupResultResponse.setPageNumber(_ctx.integerValue("DescribePredictGroupResultResponse.PageNumber"));
		describePredictGroupResultResponse.setPageSize(_ctx.integerValue("DescribePredictGroupResultResponse.PageSize"));
		describePredictGroupResultResponse.setSuccess(_ctx.booleanValue("DescribePredictGroupResultResponse.Success"));

		List<PredictGroupResultDTO> predictGroupList = new ArrayList<PredictGroupResultDTO>();
		for (int i = 0; i < _ctx.lengthValue("DescribePredictGroupResultResponse.PredictGroupList.Length"); i++) {
			PredictGroupResultDTO predictGroupResultDTO = new PredictGroupResultDTO();
			predictGroupResultDTO.setBboxCount(_ctx.integerValue("DescribePredictGroupResultResponse.PredictGroupList["+ i +"].BboxCount"));
			predictGroupResultDTO.setTimestamp(_ctx.longValue("DescribePredictGroupResultResponse.PredictGroupList["+ i +"].Timestamp"));
			predictGroupResultDTO.setImageUrl(_ctx.stringValue("DescribePredictGroupResultResponse.PredictGroupList["+ i +"].ImageUrl"));
			predictGroupResultDTO.setTrackletId(_ctx.longValue("DescribePredictGroupResultResponse.PredictGroupList["+ i +"].TrackletId"));
			predictGroupResultDTO.setIpcId(_ctx.longValue("DescribePredictGroupResultResponse.PredictGroupList["+ i +"].IpcId"));

			predictGroupList.add(predictGroupResultDTO);
		}
		describePredictGroupResultResponse.setPredictGroupList(predictGroupList);
	 
	 	return describePredictGroupResultResponse;
	}
}