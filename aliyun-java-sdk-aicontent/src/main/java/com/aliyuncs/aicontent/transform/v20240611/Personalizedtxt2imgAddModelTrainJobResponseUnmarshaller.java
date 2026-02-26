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

package com.aliyuncs.aicontent.transform.v20240611;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aicontent.model.v20240611.Personalizedtxt2imgAddModelTrainJobResponse;
import com.aliyuncs.aicontent.model.v20240611.Personalizedtxt2imgAddModelTrainJobResponse.Data;
import com.aliyuncs.aicontent.model.v20240611.Personalizedtxt2imgAddModelTrainJobResponse.Data.InferenceJobListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class Personalizedtxt2imgAddModelTrainJobResponseUnmarshaller {

	public static Personalizedtxt2imgAddModelTrainJobResponse unmarshall(Personalizedtxt2imgAddModelTrainJobResponse personalizedtxt2imgAddModelTrainJobResponse, UnmarshallerContext _ctx) {
		
		personalizedtxt2imgAddModelTrainJobResponse.setRequestId(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.requestId"));
		personalizedtxt2imgAddModelTrainJobResponse.setSuccess(_ctx.booleanValue("Personalizedtxt2imgAddModelTrainJobResponse.success"));
		personalizedtxt2imgAddModelTrainJobResponse.setErrCode(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.errCode"));
		personalizedtxt2imgAddModelTrainJobResponse.setErrMessage(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.errMessage"));
		personalizedtxt2imgAddModelTrainJobResponse.setHttpStatusCode(_ctx.integerValue("Personalizedtxt2imgAddModelTrainJobResponse.httpStatusCode"));

		Data data = new Data();
		data.setId(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.data.id"));
		data.setModelId(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.data.modelId"));
		data.setName(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.data.name"));
		data.setObjectType(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.data.objectType"));
		data.setJobStatus(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.data.jobStatus"));
		data.setJobTrainProgress(_ctx.doubleValue("Personalizedtxt2imgAddModelTrainJobResponse.data.jobTrainProgress"));
		data.setInferenceImageCount(_ctx.integerValue("Personalizedtxt2imgAddModelTrainJobResponse.data.inferenceImageCount"));
		data.setCreateTime(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.data.createTime"));

		List<String> imageUrl = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("Personalizedtxt2imgAddModelTrainJobResponse.data.imageUrl.Length"); i++) {
			imageUrl.add(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.data.imageUrl["+ i +"]"));
		}
		data.setImageUrl(imageUrl);

		List<InferenceJobListItem> inferenceJobList = new ArrayList<InferenceJobListItem>();
		for (int i = 0; i < _ctx.lengthValue("Personalizedtxt2imgAddModelTrainJobResponse.data.inferenceJobList.Length"); i++) {
			InferenceJobListItem inferenceJobListItem = new InferenceJobListItem();
			inferenceJobListItem.setId(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.data.inferenceJobList["+ i +"].id"));
			inferenceJobListItem.setPromptId(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.data.inferenceJobList["+ i +"].promptId"));
			inferenceJobListItem.setModelId(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.data.inferenceJobList["+ i +"].modelId"));
			inferenceJobListItem.setJobStatus(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.data.inferenceJobList["+ i +"].jobStatus"));
			inferenceJobListItem.setJobTrainProgress(_ctx.doubleValue("Personalizedtxt2imgAddModelTrainJobResponse.data.inferenceJobList["+ i +"].jobTrainProgress"));
			inferenceJobListItem.setCreateTime(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.data.inferenceJobList["+ i +"].createTime"));

			List<String> resultImageUrl = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("Personalizedtxt2imgAddModelTrainJobResponse.data.inferenceJobList["+ i +"].resultImageUrl.Length"); j++) {
				resultImageUrl.add(_ctx.stringValue("Personalizedtxt2imgAddModelTrainJobResponse.data.inferenceJobList["+ i +"].resultImageUrl["+ j +"]"));
			}
			inferenceJobListItem.setResultImageUrl(resultImageUrl);

			inferenceJobList.add(inferenceJobListItem);
		}
		data.setInferenceJobList(inferenceJobList);
		personalizedtxt2imgAddModelTrainJobResponse.setData(data);
	 
	 	return personalizedtxt2imgAddModelTrainJobResponse;
	}
}