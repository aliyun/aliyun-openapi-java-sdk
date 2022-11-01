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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectStepsResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectStepsResponse.DataItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectStepsResponse.DataItem.ExtraInfo;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectStepsResponse.DataItem.ExtraInfo.ErrorDetail;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectStepsResponse.DataItem.StepInfo;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectStepsResponse.DataItem.StepInfo.ConnectorFullProgressOverview;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeOmsOpenAPIProjectStepsResponse.ErrorDetail1;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOmsOpenAPIProjectStepsResponseUnmarshaller {

	public static DescribeOmsOpenAPIProjectStepsResponse unmarshall(DescribeOmsOpenAPIProjectStepsResponse describeOmsOpenAPIProjectStepsResponse, UnmarshallerContext _ctx) {
		
		describeOmsOpenAPIProjectStepsResponse.setRequestId(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.RequestId"));
		describeOmsOpenAPIProjectStepsResponse.setSuccess(_ctx.booleanValue("DescribeOmsOpenAPIProjectStepsResponse.Success"));
		describeOmsOpenAPIProjectStepsResponse.setCode(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Code"));
		describeOmsOpenAPIProjectStepsResponse.setMessage(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Message"));
		describeOmsOpenAPIProjectStepsResponse.setAdvice(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Advice"));
		describeOmsOpenAPIProjectStepsResponse.setPageNumber(_ctx.integerValue("DescribeOmsOpenAPIProjectStepsResponse.PageNumber"));
		describeOmsOpenAPIProjectStepsResponse.setPageSize(_ctx.integerValue("DescribeOmsOpenAPIProjectStepsResponse.PageSize"));
		describeOmsOpenAPIProjectStepsResponse.setTotalCount(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.TotalCount"));
		describeOmsOpenAPIProjectStepsResponse.setCost(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Cost"));

		ErrorDetail1 errorDetail1 = new ErrorDetail1();
		errorDetail1.setCode(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.ErrorDetail.Code"));
		errorDetail1.setLevel(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.ErrorDetail.Level"));
		errorDetail1.setMessage(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.ErrorDetail.Message"));
		errorDetail1.setProposal(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.ErrorDetail.Proposal"));
		describeOmsOpenAPIProjectStepsResponse.setErrorDetail1(errorDetail1);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOmsOpenAPIProjectStepsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStepOrder(_ctx.integerValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepOrder"));
			dataItem.setStepName(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepName"));
			dataItem.setStepDescription(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepDescription"));
			dataItem.setStepStatus(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepStatus"));
			dataItem.setStepProgress(_ctx.integerValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepProgress"));
			dataItem.setStartTime(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StartTime"));
			dataItem.setEstimatedRemainingSeconds(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].EstimatedRemainingSeconds"));
			dataItem.setFinishTime(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].FinishTime"));
			dataItem.setInteractive(_ctx.booleanValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].Interactive"));

			StepInfo stepInfo = new StepInfo();
			stepInfo.setJobId(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.JobId"));
			stepInfo.setIncrTimestampCheckpoint(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.IncrTimestampCheckpoint"));
			stepInfo.setCheckpoint(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.Checkpoint"));
			stepInfo.setGmt(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.Gmt"));
			stepInfo.setValidated(_ctx.booleanValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.Validated"));
			stepInfo.setSkipped(_ctx.booleanValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.Skipped"));
			stepInfo.setInconsistencies(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.Inconsistencies"));
			stepInfo.setDeployId(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.DeployId"));
			stepInfo.setProcessedRecords(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.ProcessedRecords"));
			stepInfo.setCapacity(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.Capacity"));
			stepInfo.setSrcRps(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.SrcRps"));
			stepInfo.setSrcRt(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.SrcRt"));
			stepInfo.setSrcIops(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.SrcIops"));
			stepInfo.setDstRps(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.DstRps"));
			stepInfo.setDstRt(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.DstRt"));
			stepInfo.setDstIops(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.DstIops"));
			stepInfo.setSrcRpsRef(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.SrcRpsRef"));
			stepInfo.setSrcRtRef(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.SrcRtRef"));
			stepInfo.setDstRpsRef(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.DstRpsRef"));
			stepInfo.setDstRtRef(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.DstRtRef"));
			stepInfo.setSrcIopsRef(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.SrcIopsRef"));

			ConnectorFullProgressOverview connectorFullProgressOverview = new ConnectorFullProgressOverview();
			connectorFullProgressOverview.setEstimatedTotalCount(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.ConnectorFullProgressOverview.EstimatedTotalCount"));
			connectorFullProgressOverview.setFinishedCount(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.ConnectorFullProgressOverview.FinishedCount"));
			connectorFullProgressOverview.setProgress(_ctx.integerValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.ConnectorFullProgressOverview.Progress"));
			connectorFullProgressOverview.setEstimatedRemainingTimeOfSec(_ctx.longValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].StepInfo.ConnectorFullProgressOverview.EstimatedRemainingTimeOfSec"));
			stepInfo.setConnectorFullProgressOverview(connectorFullProgressOverview);
			dataItem.setStepInfo(stepInfo);

			ExtraInfo extraInfo = new ExtraInfo();
			extraInfo.setErrorCode(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].ExtraInfo.ErrorCode"));
			extraInfo.setErrorMsg(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].ExtraInfo.ErrorMsg"));
			extraInfo.setErrorParam(_ctx.mapValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].ExtraInfo.ErrorParam"));
			extraInfo.setFailedTime(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].ExtraInfo.FailedTime"));

			List<ErrorDetail> errorDetails = new ArrayList<ErrorDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].ExtraInfo.ErrorDetails.Length"); j++) {
				ErrorDetail errorDetail = new ErrorDetail();
				errorDetail.setCode(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].ExtraInfo.ErrorDetails["+ j +"].Code"));
				errorDetail.setLevel(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].ExtraInfo.ErrorDetails["+ j +"].Level"));
				errorDetail.setMessage(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].ExtraInfo.ErrorDetails["+ j +"].Message"));
				errorDetail.setProposal(_ctx.stringValue("DescribeOmsOpenAPIProjectStepsResponse.Data["+ i +"].ExtraInfo.ErrorDetails["+ j +"].Proposal"));

				errorDetails.add(errorDetail);
			}
			extraInfo.setErrorDetails(errorDetails);
			dataItem.setExtraInfo(extraInfo);

			data.add(dataItem);
		}
		describeOmsOpenAPIProjectStepsResponse.setData(data);
	 
	 	return describeOmsOpenAPIProjectStepsResponse;
	}
}