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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeChangeOrderResponse;
import com.aliyuncs.sae.model.v20190506.DescribeChangeOrderResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeChangeOrderResponse.Data.Pipeline;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeChangeOrderResponseUnmarshaller {

	public static DescribeChangeOrderResponse unmarshall(DescribeChangeOrderResponse describeChangeOrderResponse, UnmarshallerContext _ctx) {
		
		describeChangeOrderResponse.setRequestId(_ctx.stringValue("DescribeChangeOrderResponse.RequestId"));
		describeChangeOrderResponse.setCode(_ctx.stringValue("DescribeChangeOrderResponse.Code"));
		describeChangeOrderResponse.setErrorCode(_ctx.stringValue("DescribeChangeOrderResponse.ErrorCode"));
		describeChangeOrderResponse.setMessage(_ctx.stringValue("DescribeChangeOrderResponse.Message"));
		describeChangeOrderResponse.setSuccess(_ctx.booleanValue("DescribeChangeOrderResponse.Success"));
		describeChangeOrderResponse.setTraceId(_ctx.stringValue("DescribeChangeOrderResponse.TraceId"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("DescribeChangeOrderResponse.Data.AppName"));
		data.setAuto(_ctx.booleanValue("DescribeChangeOrderResponse.Data.Auto"));
		data.setBatchCount(_ctx.integerValue("DescribeChangeOrderResponse.Data.BatchCount"));
		data.setBatchType(_ctx.stringValue("DescribeChangeOrderResponse.Data.BatchType"));
		data.setBatchWaitTime(_ctx.integerValue("DescribeChangeOrderResponse.Data.BatchWaitTime"));
		data.setChangeOrderId(_ctx.stringValue("DescribeChangeOrderResponse.Data.ChangeOrderId"));
		data.setCoType(_ctx.stringValue("DescribeChangeOrderResponse.Data.CoType"));
		data.setCoTypeCode(_ctx.stringValue("DescribeChangeOrderResponse.Data.CoTypeCode"));
		data.setCreateTime(_ctx.stringValue("DescribeChangeOrderResponse.Data.CreateTime"));
		data.setCurrentPipelineId(_ctx.stringValue("DescribeChangeOrderResponse.Data.CurrentPipelineId"));
		data.setDescription(_ctx.stringValue("DescribeChangeOrderResponse.Data.Description"));
		data.setStatus(_ctx.integerValue("DescribeChangeOrderResponse.Data.Status"));
		data.setSupportAbortFreeze(_ctx.booleanValue("DescribeChangeOrderResponse.Data.SupportAbortFreeze"));
		data.setSupportRollback(_ctx.booleanValue("DescribeChangeOrderResponse.Data.SupportRollback"));
		data.setErrorMessage(_ctx.stringValue("DescribeChangeOrderResponse.Data.ErrorMessage"));

		List<String> coTargets = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeChangeOrderResponse.Data.CoTargets.Length"); i++) {
			coTargets.add(_ctx.stringValue("DescribeChangeOrderResponse.Data.CoTargets["+ i +"]"));
		}
		data.setCoTargets(coTargets);

		List<Pipeline> pipelines = new ArrayList<Pipeline>();
		for (int i = 0; i < _ctx.lengthValue("DescribeChangeOrderResponse.Data.Pipelines.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setBatchType(_ctx.integerValue("DescribeChangeOrderResponse.Data.Pipelines["+ i +"].BatchType"));
			pipeline.setParallelCount(_ctx.integerValue("DescribeChangeOrderResponse.Data.Pipelines["+ i +"].ParallelCount"));
			pipeline.setPipelineId(_ctx.stringValue("DescribeChangeOrderResponse.Data.Pipelines["+ i +"].PipelineId"));
			pipeline.setPipelineName(_ctx.stringValue("DescribeChangeOrderResponse.Data.Pipelines["+ i +"].PipelineName"));
			pipeline.setStartTime(_ctx.longValue("DescribeChangeOrderResponse.Data.Pipelines["+ i +"].StartTime"));
			pipeline.setStatus(_ctx.integerValue("DescribeChangeOrderResponse.Data.Pipelines["+ i +"].Status"));
			pipeline.setUpdateTime(_ctx.longValue("DescribeChangeOrderResponse.Data.Pipelines["+ i +"].UpdateTime"));

			pipelines.add(pipeline);
		}
		data.setPipelines(pipelines);
		describeChangeOrderResponse.setData(data);
	 
	 	return describeChangeOrderResponse;
	}
}