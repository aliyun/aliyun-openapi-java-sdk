package com.aliyuncs.eci.transform.v20180808;

import com.aliyuncs.eci.model.v20180808.ListTagResourcesResponse;
import com.aliyuncs.eci.model.v20180808.ListTagResourcesResponse.TagResource;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

public class ListTagResourcesResponseUnmarshaller {
    public static ListTagResourcesResponse unmarshall(ListTagResourcesResponse listTagResourcesResponse, UnmarshallerContext context) {

        listTagResourcesResponse.setRequestId(context.stringValue("ListTagResourcesResponse.RequestId"));
        listTagResourcesResponse.setNextToken(context.stringValue("ListTagResourcesResponse.NextToken"));

        List<TagResource> tagResources = new ArrayList<TagResource>();
        for (int i = 0; i < context.lengthValue("ListTagResourcesResponse.TagResources.Length"); i++) {
            TagResource tagResource = new TagResource();
            tagResource.setTagKey(context.stringValue("ListTagResourcesResponse.TagResources["+ i +"].TagKey"));
            tagResource.setTagValue(context.stringValue("ListTagResourcesResponse.TagResources["+ i +"].TagValue"));
            tagResource.setResourceId(context.stringValue("ListTagResourcesResponse.TagResources["+ i +"].ResourceId"));
            tagResource.setResourceType(context.stringValue("ListTagResourcesResponse.TagResources["+ i +"].ResourceType"));

            tagResources.add(tagResource);
        }

        listTagResourcesResponse.setTagResources(tagResources);

        return listTagResourcesResponse;
    }
}
