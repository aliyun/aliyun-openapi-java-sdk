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

package com.aliyuncs.lubancloud.transform.v20180509;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lubancloud.model.v20180509.GetStylesResponse;
import com.aliyuncs.lubancloud.model.v20180509.GetStylesResponse.Style;
import com.aliyuncs.lubancloud.model.v20180509.GetStylesResponse.Style.SubStyle;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStylesResponseUnmarshaller {

	public static GetStylesResponse unmarshall(GetStylesResponse getStylesResponse, UnmarshallerContext context) {
		
		getStylesResponse.setRequestId(context.stringValue("GetStylesResponse.RequestId"));

		List<Style> styles = new ArrayList<Style>();
		for (int i = 0; i < context.lengthValue("GetStylesResponse.Styles.Length"); i++) {
			Style style = new Style();
			style.setId(context.longValue("GetStylesResponse.Styles["+ i +"].Id"));
			style.setName(context.stringValue("GetStylesResponse.Styles["+ i +"].Name"));
			style.setParentId(context.longValue("GetStylesResponse.Styles["+ i +"].ParentId"));
			style.setPreviewUrl(context.stringValue("GetStylesResponse.Styles["+ i +"].PreviewUrl"));

			List<SubStyle> subStyles = new ArrayList<SubStyle>();
			for (int j = 0; j < context.lengthValue("GetStylesResponse.Styles["+ i +"].SubStyles.Length"); j++) {
				SubStyle subStyle = new SubStyle();
				subStyle.setId(context.longValue("GetStylesResponse.Styles["+ i +"].SubStyles["+ j +"].Id"));
				subStyle.setName(context.stringValue("GetStylesResponse.Styles["+ i +"].SubStyles["+ j +"].Name"));
				subStyle.setParentId(context.longValue("GetStylesResponse.Styles["+ i +"].SubStyles["+ j +"].ParentId"));
				subStyle.setPreviewUrl(context.stringValue("GetStylesResponse.Styles["+ i +"].SubStyles["+ j +"].PreviewUrl"));

				subStyles.add(subStyle);
			}
			style.setSubStyles(subStyles);

			styles.add(style);
		}
		getStylesResponse.setStyles(styles);
	 
	 	return getStylesResponse;
	}
}