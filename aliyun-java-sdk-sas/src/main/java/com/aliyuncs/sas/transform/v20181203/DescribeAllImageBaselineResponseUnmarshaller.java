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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeAllImageBaselineResponse;
import com.aliyuncs.sas.model.v20181203.DescribeAllImageBaselineResponse.ImageBaselines;
import com.aliyuncs.sas.model.v20181203.DescribeAllImageBaselineResponse.ImageBaselines.BaselineClass;
import com.aliyuncs.sas.model.v20181203.DescribeAllImageBaselineResponse.ImageBaselines.BaselineClass.BaselineName;
import com.aliyuncs.sas.model.v20181203.DescribeAllImageBaselineResponse.ImageBaselines.BaselineClass.BaselineName.BaselineItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAllImageBaselineResponseUnmarshaller {

	public static DescribeAllImageBaselineResponse unmarshall(DescribeAllImageBaselineResponse describeAllImageBaselineResponse, UnmarshallerContext _ctx) {
		
		describeAllImageBaselineResponse.setRequestId(_ctx.stringValue("DescribeAllImageBaselineResponse.RequestId"));

		ImageBaselines imageBaselines = new ImageBaselines();

		List<BaselineClass> baselineClassList = new ArrayList<BaselineClass>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAllImageBaselineResponse.ImageBaselines.BaselineClassList.Length"); i++) {
			BaselineClass baselineClass = new BaselineClass();
			baselineClass.setClassKey(_ctx.stringValue("DescribeAllImageBaselineResponse.ImageBaselines.BaselineClassList["+ i +"].ClassKey"));
			baselineClass.setAlias(_ctx.stringValue("DescribeAllImageBaselineResponse.ImageBaselines.BaselineClassList["+ i +"].Alias"));

			List<BaselineName> baselineNameList = new ArrayList<BaselineName>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAllImageBaselineResponse.ImageBaselines.BaselineClassList["+ i +"].BaselineNameList.Length"); j++) {
				BaselineName baselineName = new BaselineName();
				baselineName.setNameKey(_ctx.stringValue("DescribeAllImageBaselineResponse.ImageBaselines.BaselineClassList["+ i +"].BaselineNameList["+ j +"].NameKey"));
				baselineName.setClassKey(_ctx.stringValue("DescribeAllImageBaselineResponse.ImageBaselines.BaselineClassList["+ i +"].BaselineNameList["+ j +"].ClassKey"));
				baselineName.setAlias(_ctx.stringValue("DescribeAllImageBaselineResponse.ImageBaselines.BaselineClassList["+ i +"].BaselineNameList["+ j +"].Alias"));

				List<BaselineItem> baselineItemList = new ArrayList<BaselineItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAllImageBaselineResponse.ImageBaselines.BaselineClassList["+ i +"].BaselineNameList["+ j +"].BaselineItemList.Length"); k++) {
					BaselineItem baselineItem = new BaselineItem();
					baselineItem.setNameKey(_ctx.stringValue("DescribeAllImageBaselineResponse.ImageBaselines.BaselineClassList["+ i +"].BaselineNameList["+ j +"].BaselineItemList["+ k +"].NameKey"));
					baselineItem.setItemKey(_ctx.stringValue("DescribeAllImageBaselineResponse.ImageBaselines.BaselineClassList["+ i +"].BaselineNameList["+ j +"].BaselineItemList["+ k +"].ItemKey"));
					baselineItem.setClassKey(_ctx.stringValue("DescribeAllImageBaselineResponse.ImageBaselines.BaselineClassList["+ i +"].BaselineNameList["+ j +"].BaselineItemList["+ k +"].ClassKey"));
					baselineItem.setAlias(_ctx.stringValue("DescribeAllImageBaselineResponse.ImageBaselines.BaselineClassList["+ i +"].BaselineNameList["+ j +"].BaselineItemList["+ k +"].Alias"));

					baselineItemList.add(baselineItem);
				}
				baselineName.setBaselineItemList(baselineItemList);

				baselineNameList.add(baselineName);
			}
			baselineClass.setBaselineNameList(baselineNameList);

			baselineClassList.add(baselineClass);
		}
		imageBaselines.setBaselineClassList(baselineClassList);
		describeAllImageBaselineResponse.setImageBaselines(imageBaselines);
	 
	 	return describeAllImageBaselineResponse;
	}
}