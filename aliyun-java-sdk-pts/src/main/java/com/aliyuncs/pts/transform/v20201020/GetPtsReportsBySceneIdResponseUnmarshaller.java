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

package com.aliyuncs.pts.transform.v20201020;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20201020.GetPtsReportsBySceneIdResponse;
import com.aliyuncs.pts.model.v20201020.GetPtsReportsBySceneIdResponse.ReportOverView;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPtsReportsBySceneIdResponseUnmarshaller {

	public static GetPtsReportsBySceneIdResponse unmarshall(GetPtsReportsBySceneIdResponse getPtsReportsBySceneIdResponse, UnmarshallerContext _ctx) {
		
		getPtsReportsBySceneIdResponse.setRequestId(_ctx.stringValue("GetPtsReportsBySceneIdResponse.RequestId"));
		getPtsReportsBySceneIdResponse.setSuccess(_ctx.booleanValue("GetPtsReportsBySceneIdResponse.Success"));
		getPtsReportsBySceneIdResponse.setCode(_ctx.stringValue("GetPtsReportsBySceneIdResponse.Code"));
		getPtsReportsBySceneIdResponse.setMessage(_ctx.stringValue("GetPtsReportsBySceneIdResponse.Message"));
		getPtsReportsBySceneIdResponse.setHttpStatusCode(_ctx.integerValue("GetPtsReportsBySceneIdResponse.HttpStatusCode"));

		List<ReportOverView> reportOverViewList = new ArrayList<ReportOverView>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsReportsBySceneIdResponse.ReportOverViewList.Length"); i++) {
			ReportOverView reportOverView = new ReportOverView();
			reportOverView.setReportId(_ctx.stringValue("GetPtsReportsBySceneIdResponse.ReportOverViewList["+ i +"].ReportId"));
			reportOverView.setReportName(_ctx.stringValue("GetPtsReportsBySceneIdResponse.ReportOverViewList["+ i +"].ReportName"));
			reportOverView.setStartTime(_ctx.stringValue("GetPtsReportsBySceneIdResponse.ReportOverViewList["+ i +"].StartTime"));
			reportOverView.setEndTime(_ctx.stringValue("GetPtsReportsBySceneIdResponse.ReportOverViewList["+ i +"].EndTime"));
			reportOverView.setAgentCount(_ctx.integerValue("GetPtsReportsBySceneIdResponse.ReportOverViewList["+ i +"].AgentCount"));
			reportOverView.setVum(_ctx.longValue("GetPtsReportsBySceneIdResponse.ReportOverViewList["+ i +"].Vum"));

			reportOverViewList.add(reportOverView);
		}
		getPtsReportsBySceneIdResponse.setReportOverViewList(reportOverViewList);
	 
	 	return getPtsReportsBySceneIdResponse;
	}
}