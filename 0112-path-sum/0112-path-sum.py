class Solution:
    def hasPathSum(self, root, targetSum):
        if root is None:
            return False

        if root.left is None and root.right is None:
            return targetSum == root.val

        targetSum -= root.val

        return (
            self.hasPathSum(root.left, targetSum) or
            self.hasPathSum(root.right, targetSum)
        )
