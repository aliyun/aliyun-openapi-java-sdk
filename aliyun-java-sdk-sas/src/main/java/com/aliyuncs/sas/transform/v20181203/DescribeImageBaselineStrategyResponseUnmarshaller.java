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

import com.aliyuncs.sas.model.v20181203.DescribeImageBaselineStrategyResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageBaselineStrategyResponse.Strategy;
import com.aliyuncs.sas.model.v20181203.DescribeImageBaselineStrategyResponse.Strategy.BaselineResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageBaselineStrategyResponseUnmarshaller {

	public static DescribeImageBaselineStrategyResponse unmarshall(DescribeImageBaselineStrategyResponse describeImageBaselineStrategyResponse, UnmarshallerContext _ctx) {
		
		describeImageBaselineStrategyResponse.setRequestId(_ctx.stringValue("DescribeImageBaselineStrategyResponse.RequestId"));

		Strategy strategy = new Strategy();
		strategy.setType(_ctx.stringValue("DescribeImageBaselineStrategyResponse.Strategy.Type"));
		strategy.setStrategyName(_ctx.stringValue("DescribeImageBaselineStrategyResponse.Strategy.StrategyName"));
		strategy.setStrategyId(_ctx.longValue("DescribeImageBaselineStrategyResponse.Strategy.StrategyId"));
		strategy.setSelectedItemCount(_ctx.integerValue("DescribeImageBaselineStrategyResponse.Strategy.SelectedItemCount"));
		strategy.setTotalItemCount(_ctx.integerValue("DescribeImageBaselineStrategyResponse.Strategy.TotalItemCount"));

		List<BaselineResult> baselineItemList = new ArrayList<BaselineResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageBaselineStrategyResponse.Strategy.BaselineItemList.Length"); i++) {
			BaselineResult baselineResult = new BaselineResult();
			baselineResult.setNameKey(_ctx.stringValue("DescribeImageBaselineStrategyResponse.Strategy.BaselineItemList["+ i +"].NameKey"));
			baselineResult.setItemKey(_ctx.stringValue("DescribeImageBaselineStrategyResponse.Strategy.BaselineItemList["+ i +"].ItemKey"));
			baselineResult.setClassKey(_ctx.stringValue("DescribeImageBaselineStrategyResponse.Strategy.BaselineItemList["+ i +"].ClassKey"));

			baselineItemList.add(baselineResult);
		}
		strategy.setBaselineItemList(baselineItemList);
		describeImageBaselineStrategyResponse.setStrategy(strategy);
	 
	 	return describeImageBaselineStrategyResponse;
	}
}